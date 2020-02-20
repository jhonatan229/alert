package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button testButom;
	@FXML
	private Button testButom1;
	
	@FXML
	public void onTestButonAction() {
		System.out.println("click");
	}
	
	@FXML
	public void onTestAlertAction() {
		Alerts.showAlert("ULTRA ERROR", "not useful", "you click in wrong button", AlertType.INFORMATION);
	}

}
