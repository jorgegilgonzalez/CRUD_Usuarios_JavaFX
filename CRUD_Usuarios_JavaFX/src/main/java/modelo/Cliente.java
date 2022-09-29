/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Rocio
 */
public class Cliente {
    private String correo_electronico;
    private String pass;
    private double descuentos;

    public Cliente(String correo_electronico, String pass, double descuentos) {
        this.correo_electronico = correo_electronico;
        this.pass = pass;
        this.descuentos = descuentos;
    }

    public Cliente() {
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public String getPass() {
        return pass;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }
    
    @Override public String toString()
{
String mensaje = "Correo:"+correo_electronico+"\nPass: "+pass+"\nDescuento: "+descuentos; return mensaje;
}
    
    
    
}
