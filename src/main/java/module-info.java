module io.github.mortenjenne.frigdechef {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.kordamp.bootstrapfx.core;

    opens io.github.mortenjenne.frigdechef to javafx.fxml, com.google.gson;

    exports io.github.mortenjenne.frigdechef;
}