package application;
	
import java.util.Observable;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Programa extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Text meuNome = new Text("Jessica");
			meuNome.setFont(new Font(45));
			meuNome.setX(150);
			meuNome.setY(150);
			
			Text texto = new Text("OI");
			texto.setFont(new Font(45));
			texto.setX(150);
			texto.setY(190);
			
			Text texto2 = new Text("tudo bem?");
			texto2.setFont(new Font(45));
			texto2.setX(180);
			texto2.setY(210);
			
			
			Group root = new Group();
			Scene scene = new Scene(root,500,400);
			scene.setFill(Color.BLUEVIOLET);
			
			ObservableList<Node> listaNodes = root.getChildren();
//			listaNodes.add(texto);
//			listaNodes.add(texto2);
//			listaNodes.add(meuNome);
			listaNodes.addAll(meuNome, texto, texto2);
			
			primaryStage.setTitle("Programa JavaFX da Jessica");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
