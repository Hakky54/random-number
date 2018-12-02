module nl.altindag.random {
    requires spring.context;
    requires javafx.fxml;
    requires javafx.controls;
    requires spring.beans;
    requires spring.security.core;
    requires spring.boot.autoconfigure;
    requires spring.boot;

    opens nl.altindag.random to javafx.fxml, spring.core;
    exports nl.altindag.random to javafx.graphics, spring.beans, spring.context;
}