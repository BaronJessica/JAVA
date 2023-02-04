package application;

import java.util.Observable;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Programa extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox root = new VBox();
			root.setSpacing(5);
			root.setAlignment(Pos.CENTER);
			
			Text login = new Text("Login");
			Text senha = new Text("Senha");
			
			TextField tfLogin = new TextField();
			TextField tfSenha = new TextField();
			
			Button btnEnviar = new Button("Enviar");
			
			ObservableList<Node> nodes = root.getChildren();
			nodes.addAll(login, tfLogin, senha, tfSenha, btnEnviar);

			Scene scene = new Scene(root, 400, 300);
			primaryStage.setTitle("exemplo Layout");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}