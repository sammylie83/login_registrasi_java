/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Pattern;
/**
 *
 * @author Lie Samsudin
 */
public class Base64Encripsi {
    
    public static void main(String... args) throws Exception {
        final String s = "Password1";
        final byte[] authBytes = s.getBytes(StandardCharsets.UTF_8);
        final String encoded = Base64.getEncoder().encodeToString(authBytes);
        System.out.println(s + " => " + encoded);
        
        String encodedString = Base64.getEncoder().encodeToString(s.getBytes());

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("decode => " + decodedString);
    }
}
