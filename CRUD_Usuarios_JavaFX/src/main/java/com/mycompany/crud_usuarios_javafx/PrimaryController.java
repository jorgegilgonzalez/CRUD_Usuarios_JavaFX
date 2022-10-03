/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.crud_usuarios_javafx;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import Utilidades.Validar;
import modelo.*;



/**
 * FXML Controller class
 *
 * @author donjo
 */
public class PrimaryController implements Initializable {

    ConexionSingleton conexion = ConexionSingleton.getInstancia();
    
    @FXML
    private Button btnAnadir;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnIngresos;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnSalir;

    @FXML
    private ToggleGroup grpSiNo;

    @FXML
    private Pane layPane;

    @FXML
    private Pane panePremium;

    @FXML
    private RadioButton radioNo;

    @FXML
    private RadioButton radioSi;

    @FXML
    private TextField txtContrasena;

    @FXML
    private TextField txtDescuento;

    @FXML
    private TextField txtUsuario;

     @FXML
    void btnAnadirOnAction(ActionEvent event) throws SQLException {

        
        
        
        Usuario usuario = new Usuario();
        
        if(Validar.validaEmail(txtUsuario.getText())){//valido el email antes de proceder a insertar el registro
        usuario.setCorreo_electronico(txtUsuario.getText());
        usuario.setPass(txtContrasena.getText());
        usuario.setDescuentos(Double.parseDouble(txtDescuento.getText()));
        usuario.setPremium(radioSi.isSelected());
        //System.out.println(usuario.toString());
        
        CRUDUsuario.insertarUsuario(conexion.getConexion(), usuario);}//si no valida avisa por consola
        else System.out.println("El email no esta en formato correcto");
        
        
        conexion.desconectar();
        btnLimpiarOnAction(event);//para que borre los datos una vez insertado el registro
         
    }

    @FXML
    void btnBuscarOnAction(ActionEvent event) throws SQLException {

       
       CRUDUsuario.buscarUsuario(conexion.getConexion(), txtUsuario.getText());
       conexion.desconectar();
        
    }

    @FXML
    void btnIngresosOnAction(ActionEvent event) throws SQLException {
        
        ;
        CRUDUsuario.totalIngresos(conexion.getConexion());
        conexion.desconectar();
                
    }

    @FXML
    void btnLimpiarOnAction(ActionEvent event) {

        txtUsuario.setText("");
        txtContrasena.setText("");
        txtDescuento.clear();
        radioNo.setSelected(true);
                       
        
    }

    @FXML
    void btnSalirOnAction(ActionEvent event) {

        System.exit(0);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
