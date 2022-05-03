/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mensajes;

import java.sql.Connection;

/**
 *
 * @author jamesmaldonado
 */
public class Mensajes {

    public static void main(String[] args) {
         
  Conexion conexion = new Conexion();
      try(Connection cnx = conexion.get_Connection()) {
          
      } catch (Exception e) {
          System.out.println(e);
          
      }
  
  }
    }

