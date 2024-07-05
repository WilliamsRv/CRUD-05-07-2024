/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lab9
 */
public class conexion {
    Connection con;

    public conexion() {
        String url = "jdbc:mysql://mysql.cx6ywqwc6n1s.us-east-1.rds.amazonaws.com:3306/persona";
        String usuario = "admin";
        String password = "Polula3128";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("error de conexion: "+e);
        }
    }

    public Connection getCon() {
        return con;
    }
}
