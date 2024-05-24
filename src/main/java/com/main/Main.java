package com.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage Window) throws Exception {
		loadMainView(Window);
	}

	public void loadMainView(Stage Window) throws IOException {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainController.fxml"));
		StackPane stackPane = loader.load();
		Scene scene = new Scene(stackPane, 600, 400);
		Window.setScene(scene);
		Window.setTitle("Apka");
		Window.show();
	}

}
