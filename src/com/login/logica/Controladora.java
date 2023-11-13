package com.login.logica;

import com.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }

    public String validarUsuario(String usuario, String contrasena) {

        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        boolean usuarioEncontrado = false;

        
        for (Usuario usu : listaUsuarios) {     
            if (usu.getNombreUsuario().equals(usuario) && usu.getContrasena().equals(contrasena)) {
                usuarioEncontrado = true;
                break;
            }
        }
        if (!usuarioEncontrado) {
            mensaje = "Usuario no encontreado";
        }
        return mensaje;
    }
}
