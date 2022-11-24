package controller.controllerTelas;

import model.Principal;
import model.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import data.UsuarioDados;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class TelaCadastroController implements Initializable {

    @FXML
    private Label alerta;
    @FXML
    private TextField campoNome, campoUsuario, campoSenha;

    @FXML
    public void enter(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER))
            botaoFinalizarCadastro();
    }

    @FXML
    public void botaoFinalizarCadastro() {
        String nome = campoNome.getText().toString().trim();
        String usuario = campoUsuario.getText().toString().trim();
        String senha = campoSenha.getText().toString().trim();

        UsuarioDados cliente = new UsuarioDados();

        if (nome.equals("") || usuario.equals("") || senha.equals("")) {
            alerta.setText("Campos não podem ficar em branco");
            return;
        }

        Usuario u = new Usuario(nome, usuario, senha);
        String resposta = cliente.cadastrarUsuario(u);

        if (!resposta.equals("")) {
            alerta.setText(resposta);
            return;
        }

        Alert confirmacao = new Alert(Alert.AlertType.INFORMATION);
        confirmacao.setTitle("Confirmação");
        confirmacao.setHeaderText("");
        confirmacao.setContentText("Usuário cadastrado!");
        confirmacao.setResult(ButtonType.OK);
        confirmacao.showAndWait();

        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaMenu.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @FXML
    public void botaoVoltar() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaLogin.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}