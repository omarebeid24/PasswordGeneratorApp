module com.example.password_generator3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.password_generator3 to javafx.fxml;
    exports com.example.password_generator3;
}