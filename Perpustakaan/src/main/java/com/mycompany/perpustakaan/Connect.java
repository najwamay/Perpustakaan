/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Arif
 */
public class Connect {
    public void connect(){
        String url = "jdbc:mysql://localhost:3306/perpustakaan";
        String username = "root";
        String password = "";
        try {
            Connection koneksi = DriverManager.getConnection(url, username, password);
            Statement st = koneksi.createStatement();
            System.out.println("koneksi berhasil");
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }   
    }
}
