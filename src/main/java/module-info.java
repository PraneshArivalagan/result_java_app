module com.example.result {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.result to javafx.fxml;
    exports com.example.result;
}