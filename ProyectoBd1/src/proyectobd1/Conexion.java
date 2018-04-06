/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd1;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Josué Zelaya
 */
public class Conexion {
     
    public Connection conectar(){
        String url="jdbc:sqlserver://DESKTOP-BBK328O:1433;databaseName=Proyecto";
        String pass="1234";
        String us="josue";
        Connection cn=null;
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection(url, us, pass);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa con la Base de Datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con la conexion"+e);
        }
        return cn;
    }
}
