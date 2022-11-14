module com.raven.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.raven.calculator to javafx.fxml;
    exports com.raven.calculator;
}
