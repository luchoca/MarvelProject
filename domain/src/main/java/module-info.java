module com.example.domain {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.domain to javafx.fxml;
    exports com.example.domain;
}