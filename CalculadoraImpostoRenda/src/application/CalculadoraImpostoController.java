package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraImpostoController {

	@FXML
	private TextField txtSalario;

	@FXML
	private Label lblAliquota;

	public void onBtnCalcClick() {
		String txtSalarioDigitado = txtSalario.getText(); // recuperei valor digitado como string

		Double salario = Double.parseDouble(txtSalarioDigitado); // converti o valor string para double

		Double aliquota; // variavel para atribuir o valor da aliquota de acordo com a logica

		if (salario <= 1903.98) {
			aliquota = 0.0;
		} else if (salario >= 1903.99 && salario <= 2826.65) {
			aliquota = 7.5;
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			aliquota = 15.0;
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			aliquota = 22.5;
		} else {
			aliquota = 27.5;
		}

		lblAliquota.setText(aliquota.toString());

	}

	public void onBtnLimparClick() {

		txtSalario.setText(null);
		lblAliquota.setText(null);
	}

}
