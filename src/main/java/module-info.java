module com.example.info_projekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.info_projekt to javafx.fxml;
    //exports com.example.info_projekt;
}