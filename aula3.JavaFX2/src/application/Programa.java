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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Programa extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			
			
//			//			HBox root = new HBox();
//			
//			root.setAlignment(Pos.TOP_CENTER);
//			root.setSpacing(20);
//			
//			Button btnOK = new Button("OK");
//			Button btnLimpar = new Button("Limpar");
//			Button btnCancelar = new Button("Cancelar");
//			
//			
//			ObservableList<Node> nodes = root.getChildren();
//			nodes.add(btnCancelar);
//			nodes.add(btnLimpar);
//			nodes.add(btnOK);
			
			
			
//			BorderPane root = new BorderPane();
//			Button btnOK = new Button("OK");
//			Button btnLimpar = new Button("Limpar");
//			Button btnCancelar = new Button("Cancelar");
//			Text text = new Text("Direita");
//			root.setTop(btnOK);
//			root.setBottom(btnLimpar);
//			root.setCenter(btnCancelar);
//			root.setRight(text);
			
			StackPane root = new StackPane();
			Circle blackCircle = new Circle(50);
			Circle blueCircle = new Circle(35);
			blackCircle.setFill(Color.BLACK);
			blueCircle.setFill(Color.BLUEVIOLET);
			
			ObservableList<Node> nodes = root.getChildren();
			nodes.addAll(blackCircle, blueCircle);
			
			
		
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("exemplo Layout");
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