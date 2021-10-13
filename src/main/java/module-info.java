module com.example.calendar_sps {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calendar_sps to javafx.fxml;
    exports com.example.calendar_sps;
}