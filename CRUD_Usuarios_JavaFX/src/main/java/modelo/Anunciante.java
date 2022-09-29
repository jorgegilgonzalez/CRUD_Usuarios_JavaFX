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
public class Anunciante extends Cliente{
    private int numeroAnuncios ;

    public Anunciante(int numeroAnuncios, String correo_electronico, String pass, double descuentos) {
        super(correo_electronico, pass, descuentos);
        this.numeroAnuncios = numeroAnuncios;
    }

    public int getNumeroAnuncios() {
        return numeroAnuncios;
    }

    public void setNumeroAnuncios(int numeroAnuncios) {
        this.numeroAnuncios = numeroAnuncios;
    }
    
    
}
