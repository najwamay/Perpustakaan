/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.perpustakaan;
import java.util.*;
/**
 *
 * @author Arif
 */
public class Perpustakaan {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306//perpustakaan";
        String username = "root";
        String password = "";
        Connect con = new Connect();
        con.connect();
    }
}
