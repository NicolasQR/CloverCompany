package ui;


import java.io.IOException;

=======
>>>>>>> 843e3a6b99cc6874bea5aa9212de89c2848889a6
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


	private LoginGUI loginGUI;
	
	public Main() throws IOException {
		loginGUI = new LoginGUI();
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		

		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
		fxmlLoader.setController(loginGUI);

		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Clover Company");
		primaryStage.setResizable(false);
		primaryStage.show();

		
	}

}

