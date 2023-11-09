module com.example.practiceworkninenovemberjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practiceworkninenovemberjavafx to javafx.fxml;
    exports com.example.practiceworkninenovemberjavafx;
}