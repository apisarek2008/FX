package com.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class NextController {

	private MainController mainController;

	@FXML
	public void actBack() {
		System.out.println("BACK");
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

}
