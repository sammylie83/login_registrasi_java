/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Lie Samsudin
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/login";
                String user = "root";
                String password = "admin";
//                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Class.forName("com.mysql.cj.jdbc.Driver");
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    
    public static void main(String args[]){
        getKoneksi();
    }
}
