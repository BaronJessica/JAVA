package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
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
			
			
			Group root = new Group(meuNome);
			Scene scene = new Scene(root,500,400);
			scene.setFill(Color.BLUEVIOLET);
			
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
