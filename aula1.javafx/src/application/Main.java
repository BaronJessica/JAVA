package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Text texto = new Text("Hello World!");
			texto.setFont(new Font(45));
			texto.setX(50);
			texto.setY(150);
			
			Line linha = new Line();
			linha.setStartX(200);
			linha.setStartY(200);
			linha.setEndX(0);
			linha.setEndY(0);
			
			Group root = new Group(linha);		
			Scene scene = new Scene(root,700,700);
			scene.setFill(Color.LAVENDER);
			
			
			
			primaryStage.setTitle("Primeiro ex javaFX");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args); //responsável por abrir a tela, instanciar a tela e é representado através de um objeto stage
	}
}
