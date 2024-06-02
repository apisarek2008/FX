package com.controllers;

import java.io.IOException;

import com.main.Main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class NextController {

	private MainController mainController;
	@FXML
	private Pane PaneID;
	
	
	@FXML
	public void actBack() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainController.fxml"));
		Pane Pane = null;
		try {
			Pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		mainController.setScreen(Pane);
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

	
	

}
