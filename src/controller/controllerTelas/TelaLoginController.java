package controller.controllerTelas;

import model.Principal;

import java.net.URL;
import java.util.ResourceBundle;

import data.UsuarioDados;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaLoginController implements Initializable {

    @FXML
    private Label alerta;
    @FXML
    private TextField campoNome, campoUsuario, campoSenha;

    @FXML
    public void botaoEntrarLogin() {

        String usuario = campoUsuario.getText().toString().trim();
        String senha = campoSenha.getText().toString().trim();

        if (usuario.equals("") || senha.equals("")) {
            alerta.setText("Campos não podem ficar em branco");
            return;
        }

        UsuarioDados uDados = new UsuarioDados();
        String resposta = uDados.fazerLoginUsuario(usuario, senha);

        if (!resposta.equals("")) {
            alerta.setText(resposta);
            return;
        }

        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaMenu.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @FXML
    public void botaoCriarConta() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaCadastro.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}