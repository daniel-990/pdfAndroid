package com.example.registroproductos.Connection;

import androidx.appcompat.app.AlertDialog;

import com.example.registroproductos.MainActivity;
import com.example.registroproductos.Models.Conector;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

    public static final Conector conector = new Conector();

    public Connection getConection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(conector.getURL(), conector.getUSER(), conector.getPAS());
            System.out.println("conecto a base de datos");
        }catch (Exception e){
            System.out.println("error: "+e.getMessage());
        }
        return con;
    }
}
