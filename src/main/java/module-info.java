module io.github.mortenjenne.frigdechef {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.kordamp.bootstrapfx.core;

    opens io.github.mortenjenne.frigdechef to javafx.fxml, com.google.gson;

    exports io.github.mortenjenne.frigdechef;
    exports io.github.mortenjenne.frigdechef.controller;
    opens io.github.mortenjenne.frigdechef.controller to com.google.gson, javafx.fxml;
    exports io.github.mortenjenne.frigdechef.model;
    opens io.github.mortenjenne.frigdechef.model to com.google.gson, javafx.fxml;
    exports io.github.mortenjenne.frigdechef.logic;
    opens io.github.mortenjenne.frigdechef.logic to com.google.gson, javafx.fxml;
    exports io.github.mortenjenne.frigdechef.util;
    opens io.github.mortenjenne.frigdechef.util to com.google.gson, javafx.fxml;
}