module com.mycompany.crud_usuarios_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;// para que cargue la dependencia de conexion mysql
    
            
    opens com.mycompany.crud_usuarios_javafx to javafx.fxml;
    exports com.mycompany.crud_usuarios_javafx;
}
