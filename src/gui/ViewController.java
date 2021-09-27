package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController implements Initializable{
	@FXML
	private Button btSoma;
	@FXML
	private TextField txNumber1;
	@FXML
	private TextField txNumber2;
	@FXML
	private Label labelSoma;

	@FXML
	public void onBtTestAction() {

		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txNumber1.getText());
			double number2 = Double.parseDouble(txNumber2.getText());
			double soma = number1 + number2;
			labelSoma.setText(String.format("%.2f", soma));
		} catch (Exception e) {
			Alerts.showAlert("UniCalc", "Erro", e.getMessage(), AlertType.ERROR);
		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constraints.setTextFieldDouble(txNumber1);
		Constraints.setTextFieldDouble(txNumber2);
		Constraints.setTextFieldMaxLength(txNumber1, 3);
		Constraints.setTextFieldMaxLength(txNumber2, 3);
	}
	
	

}