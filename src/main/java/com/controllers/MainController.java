package com.controllers;

import java.io.IOException;

import com.main.Main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainController {

	
	@FXML
	private StackPane mainStackID;
	

	@FXML
	private void actNext() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/NextController.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {

			e.printStackTrace();
		}
		NextController nextController = loader.getController();
		nextController.setMainController(this);
		mainStackID.getChildren().add(pane);
	}

	

	public void setScreen(Pane pane) {
		mainStackID.getChildren().clear();
		mainStackID.getChildren().add(pane);

	}

	
}
