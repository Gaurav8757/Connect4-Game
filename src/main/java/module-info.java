module com.gaurav.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gaurav.connect4 to javafx.fxml;
    exports com.gaurav.connect4;
}