module com.mycompany.crud_usuarios_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.crud_usuarios_javafx to javafx.fxml;
    exports com.mycompany.crud_usuarios_javafx;
}
