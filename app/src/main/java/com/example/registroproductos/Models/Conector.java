package com.example.registroproductos.Models;

public class Conector {
    /*
    ----
    * conector a base de datos CleverCloud
    * */

    String URL = "jdbc:mysql://bcbdnp4clfjvyhj0r37q-mysql.services.clever-cloud.com";
    String USER = "uokldxkoryzk33ck";
    String PAS = "8lX3lFTjRZ8NHo9XlnIk";

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getPAS() {
        return PAS;
    }

    public void setPAS(String PAS) {
        this.PAS = PAS;
    }
}
