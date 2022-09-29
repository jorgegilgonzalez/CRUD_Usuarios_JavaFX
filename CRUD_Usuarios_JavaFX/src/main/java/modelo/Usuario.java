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
public class Usuario extends Cliente{
    private boolean premium;

    public Usuario(boolean premium, String correo_electronico, String pass, double descuentos) {
        super(correo_electronico, pass, descuentos);
        this.premium = premium;
    }

    public Usuario() {
    }

    public boolean getPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    
    @Override public String toString()
    {
    String mensaje = super.toString()+"\nPremium:"+premium; return mensaje;
    }
    
}
