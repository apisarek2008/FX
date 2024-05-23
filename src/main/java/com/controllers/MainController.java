package com.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainController {

	@FXML
	private StackPane stackPane;

	@FXML
	public void actNext() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/NextController.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			System.out.println("Nie można załadować kontrolera NEXTCONTROLER...");
			e.printStackTrace();
		}
		NextController nextController = loader.getController();
		nextController.setMainController(this);
		setScreen(pane);
		
	}

	private void setScreen(Pane pane) {
		stackPane.getChildren().clear();
		stackPane.getChildren().add(pane);
		
	}
}
