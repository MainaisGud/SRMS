module EVMUI {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.graphics;
	requires junit;
	opens application to javafx.graphics, javafx.fxml;
}
