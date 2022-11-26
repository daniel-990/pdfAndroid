package com.example.registroproductos.Controllers;

import com.example.registroproductos.Connection.DataBase;
import com.example.registroproductos.Models.Conector;
import com.example.registroproductos.Models.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ControllerDatos {
    public static Producto producto = new Producto();
    public static DataBase conectarBaseDatos = new DataBase();

    //elementos sql
    public static String sql;
    public static PreparedStatement ps;
    public static Connection con = conectarBaseDatos.getConection();

    public void insertar(String nombre, String descripcion, String categoria, int cantidad, int precio){

        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setCategoria(categoria);
        producto.setCantidad(cantidad);
        producto.setPrecio(precio);

        try{
            sql = "INSERT INTO db_producto (nombre, descripcion, categoria, cantidad, precio) VALUES ('"+producto.getNombre()+"','"+producto.getDescripcion()+"','"+producto.getCategoria()+"','"+producto.getCantidad()+"','"+producto.getPrecio()+"')";
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("se ejecuta carga de datos");
        }catch(Exception e){
            System.out.println("error al guardar datos: "+e.getMessage());
        }

    }

}
