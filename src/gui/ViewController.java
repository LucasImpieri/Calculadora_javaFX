package gui;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController {
	
	//Declaration of an attribute corresponds to the control, @FXML - Link with the screen
	
	@FXML
	private TextField labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML
	private Button btPlus;

	@FXML
	private Button btSub;

	@FXML
	private Button btDiv;
	
	@FXML
	private Button btEqual;
	
	@FXML
	private Button btClear;
	
	@FXML
	private Button btOne;
	
	@FXML
	private Button btTwo;
	
	@FXML
	private Button btThree;
	
	@FXML
	private Button btFour;
	
	@FXML
	private Button btFive;
	
	@FXML
	private Button btSix;
	
	@FXML
	private Button btSeven;
	
	@FXML
	private Button btEight;
	
	@FXML
	private Button btNine;
	
	@FXML
	private Button btZero;
	
	@FXML
	private Button btInvert;
	
	@FXML
	private Button btScore;
	
	private double save1 = 0;
	
	private double save2 = 0;
	
	private double result = 0;
	
	private String operation = "";
	
	private double numberAux;
	
	// Control's desired event method (a control can have multiple events)
	
	@FXML
	public void onBtOneAction () {
			Locale.setDefault(Locale.US);
			labelResult.setText(labelResult.getText() + "1");
	}
	
	@FXML
	public void onBtTowAction () {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + "2");
	}
	
	@FXML
	public void onBtThreeAction () {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + "3");
	}
	
	@FXML
	public void onBtFourAction () {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + "4");
	}
	
	@FXML
	public void onBtFiveAction () {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + "5");
	}
	
	@FXML
	public void onBtSixAction () {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + "6");
	}
	
	@FXML
	public void onBtSevenAction () {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + "7");
	}
	
	@FXML
	public void onBteightAction () {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + "8");
	}
	
	@FXML
	public void onBtNineAction () {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + "9");
	}
	
	@FXML
	public void onBtZeroAction () {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + "0");
	}
	
	@FXML
	public void onBtInvertAction () {
		Locale.setDefault(Locale.US);
		numberAux = Double.parseDouble(labelResult.getText());
		labelResult.setText(Double.toString(numberAux*(-1)));
	}
	
	@FXML
	public void onBtScoreAction() {
		Locale.setDefault(Locale.US);
		labelResult.setText(labelResult.getText() + ".");
	}
	
	@FXML
	public void onBtSumAction () {
		save1 = Double.parseDouble(labelResult.getText());
		labelResult.clear();
		operation = "+";
	}
	
	@FXML
	public void onBtPlusAction () {
		save1 = Double.parseDouble(labelResult.getText());
		labelResult.clear();
		operation = "*";
	}
	
	@FXML
	public void onBtSubAction () {
		save1 = Double.parseDouble(labelResult.getText());
		labelResult.clear();
		operation = "-";
	}
	
	@FXML
	public void onBtDivAction () {
		save1 = Double.parseDouble(labelResult.getText());
		labelResult.clear();
		operation = "/";
	}
	
	@FXML
	public void onBtEqualAction () {
		save2 = Double.parseDouble(labelResult.getText());
		
		switch (operation) {
		case "+":
			result = save1 + save2;
			labelResult.setText(Double.toString(result));
			break;
		case "-":
			result = save1 - save2;
			labelResult.setText(Double.toString(result));
			break;
		case "*":
			result = save1 * save2;
			labelResult.setText(Double.toString(result));
			break;
		case "/":
			result = save1 / save2;
			labelResult.setText(Double.toString(result));
			break;
		}
		save1 = 0;
		save2 = 0;
		operation = "";
	}
	
	@FXML
	public void onBtClearAction() {
		labelResult.setText("");
		save1 = 0;
		save2 = 0;
		operation = "";
	}
}
