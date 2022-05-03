/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jamesmaldonado
 */
public class Conexion {
   
    public Connection get_Connection(){
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","12345");
      if (conection != null){
      System.out.print("conexion exitosa");
      }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
    
}
