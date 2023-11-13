package com.login.Encriptacion;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class contrasenaEncrip {

    String LLAVE = "HolaEstoyProgramando";

    // Clave de encriptacion
    public SecretKeySpec Crearclave(String llave) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] cadena = md.digest(llave.getBytes("UTF-8"));
            cadena = Arrays.copyOf(cadena, 16); // Solo se necesitan los primeros 16 bytes para AES
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            return secretKeySpec;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Encriptar
    public String Encriptar(String encriptar) {
        try {
            SecretKeySpec secretKeySpec = Crearclave(LLAVE);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); // Modo de operación y relleno
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadena_encriptada = Base64.getEncoder().encodeToString(encriptada);
            return cadena_encriptada;

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
