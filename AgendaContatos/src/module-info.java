module AgendaContatos {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires mysql.connector.j;
	exports model;
	opens application to javafx.graphics, javafx.fxml;
}
