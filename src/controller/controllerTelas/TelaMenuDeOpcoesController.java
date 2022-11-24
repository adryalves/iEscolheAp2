package controller.controllerTelas;

import model.Principal;

import java.net.URL;
import java.util.ResourceBundle;
import data.UsuarioDados;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

public class TelaMenuDeOpcoesController implements Initializable {

    @FXML
    public void botaoFavoritos() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaFavoritos.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @FXML
    public void botaoVoltar() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaMenu.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @FXML
    public void botaoSair() {
        try {
            UsuarioDados.usuarioLogado = null;
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