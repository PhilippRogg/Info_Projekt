module com.example.info_projekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens MainModel to javafx.fxml;
    exports MainModel;
}