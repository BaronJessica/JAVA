package application;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.beans.binding.BooleanBinding;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Contato;
import model.ContatoDAOMySQL;
import model.IContatoDAO;

public class AgendaContatosController implements Initializable {

	@FXML
	private TableView<Contato> tvContatos;

	@FXML
	private TableColumn<Contato, String> tcNome;

	@FXML
	private TableColumn<Contato, String> tcNumero;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtNumero;

	@FXML
	private Button btnIncluir;
	@FXML
	private Button btnExcluir;
	@FXML
	private Button btnAtualizar;
	@FXML
	private Button btnLimpar;

	private IContatoDAO contatoDAO;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		tcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tcNumero.setCellValueFactory(new PropertyValueFactory<>("numero"));

		// logica de preenchimento do formulario ao clique na tabela TV
		tvContatos.getSelectionModel().selectedItemProperty().addListener((b, o, n) -> {
			if (n != null) {
				txtNome.setText(n.getNome());
				txtNumero.setText(n.getNumero());
			}
		});
		// variavel do tipo BooleanBinding é uma classe
		BooleanBinding temContatoSelecionado = tvContatos.getSelectionModel().selectedItemProperty().isNotNull();

		BooleanBinding temCampoPreenchido = txtNome.textProperty().isNotEmpty()
				.or(txtNumero.textProperty().isNotEmpty());

		btnIncluir.disableProperty().bind(temContatoSelecionado);
		btnAtualizar.disableProperty().bind(temContatoSelecionado.not());
		btnExcluir.disableProperty().bind(temContatoSelecionado.not());
		btnLimpar.disableProperty().bind(temCampoPreenchido.not());

		// inicializando DAO
		contatoDAO = new ContatoDAOMySQL();

		// pré carregar a minha tableview com os contato salvos no bd
		atualizarLista();

	}

	private void atualizarLista() {

		tvContatos.getItems().clear();
		tvContatos.getItems().setAll(contatoDAO.obterTodos());

	}

	public void onBtnIncluirClick() {

		String nomeDigitado = txtNome.getText();
		String numeroDigitado = txtNumero.getText();

		Contato contato = new Contato(nomeDigitado, numeroDigitado);

		contatoDAO.incluir(contato);

		atualizarLista();

		reset();
	}

	public void onBtnAtualizarClick() {

		String nomeDigitado = txtNome.getText();
		String numeroDigitado = txtNumero.getText();

		Contato contatoSelecionado = tvContatos.getSelectionModel().getSelectedItem();

		contatoSelecionado.setNome(nomeDigitado);
		contatoSelecionado.setNumero(numeroDigitado);

		contatoDAO.atualizar(contatoSelecionado);

		atualizarLista();

		reset();

	}

	public void onBtnExcluirClick() {
		Contato contatoSelecionado = tvContatos.getSelectionModel().getSelectedItem();

		contatoDAO.remover(contatoSelecionado.getId());

		atualizarLista();
		reset();

	}

	public void onBtnLimparClick() {
		reset();
	}

	private void reset() {
		txtNome.setText("");
		txtNumero.setText("");
		tvContatos.getSelectionModel().clearSelection();
	}
}
