module com.example.business {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.business to javafx.fxml;
    exports com.example.business;
}