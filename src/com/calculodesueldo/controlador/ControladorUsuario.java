
package com.calculodesueldo.controlador;

import com.calculodesueldo.exepciones.UsuarioExepcion;
import com.calculodesueldo.modelo.Rol;
import com.calculodesueldo.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ControladorUsuario {
    private Rol [] roles;
    private List<Usuario> usuarios;
    
    public ControladorUsuario(){
        inicializarColecciones();        
    }
    private void inicializarColecciones()
    {
         roles = new Rol[2];
         roles[0]= new Rol((byte)1, "Administrador");
         roles[1]= new Rol((byte)2, "Consulta");
        
        
        usuarios = new ArrayList<>();//Polimorfismo
        /// Donde yo cargaria los usuarios de una base de datos
        // Un archivo de excel, un archivo plano o un SGBD
        // Mysql, Postgres, Oracle, SqlSErver, 
        // Mariadb, MOngo, Dynamo
        usuarios.add(new Usuario("caarias89798@umanizales.edu.co","123456",roles[0],
                "Carlos Arias"));
        usuarios.add(new Usuario("carloaiza@umanizales.edu.co","654321",roles[1],
        "Carlos Loaiza"));       
        
    }
    
    public Usuario verificarUsuario(String correo, String contrasenia)
            throws UsuarioExepcion
    {
        if(correo == null || correo.equals("") || contrasenia ==null
                || contrasenia.equals(""))
        {
            throw new UsuarioExepcion("Debe diligenciar todos los datos");
        }
        if(!validarCorreo(correo))
        {
            throw new UsuarioExepcion("En el campo usuario debe ingresar un"
                    + " correo válido");
        }
        if(contrasenia.length()<6)
        {
            throw new UsuarioExepcion("La contraseña debe tener al menos"
                    + "6 caracteres");
        }
        
        for(Usuario usu: usuarios)
        {
            if(usu.getCorreo().equals(correo) && 
                    usu.getContrasenia().equals(contrasenia))
            {
                return usu;
            }
        }
        ///Significa que el usuario o la contraseña son erradas
        throw new UsuarioExepcion("Los datos ingresados son errados");
    }
    
    private boolean validarCorreo(String email) {
        boolean espacios = true;

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher matcher = pattern.matcher(email);

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == ' ') {
                espacios = false;
                break;
            }
        }

        return matcher.find() && espacios;
    }
    
}

