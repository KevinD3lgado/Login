
package com.login.persistencia;

import com.login.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
        //SELECT * FROM USUARIOS
    }
    
    public void registrarUsuario(Usuario usuario){
        try {
            usuJpa.create(usuario);
        } catch (Exception e) {
            e.printStackTrace(); // Manejo adecuado de excepciones
        }
    }
}
