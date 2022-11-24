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
import javafx.scene.layout.VBox;
import javafx.animation.FadeTransition;
import javafx.util.Duration;

public class TelaMenuController implements Initializable {

    @FXML
    private Label labelCafe, labelSobremesa, apresentacao;

    @FXML
    private VBox labelsAlmocoJantar;

    private Duration fadeDuration = Duration.millis(300);
    private double fadeOpacityMax = 0.85;

    @FXML
    public void mostrarTextoCafe() {
        FadeTransition fadeMostrar = new FadeTransition();
        fadeMostrar.setDuration(fadeDuration);
        fadeMostrar.setFromValue(0);
        fadeMostrar.setToValue(fadeOpacityMax);
        fadeMostrar.setNode(labelCafe);
        fadeMostrar.play();
    }

    @FXML
    public void esconderTextoCafe() {
        FadeTransition fadeEsconder = new FadeTransition();
        fadeEsconder.setDuration(fadeDuration);
        fadeEsconder.setFromValue(fadeOpacityMax);
        fadeEsconder.setToValue(0);
        fadeEsconder.setNode(labelCafe);
        fadeEsconder.play();
    }

    @FXML
    public void mostrarTextoSobremesa() {
        FadeTransition fadeMostrar = new FadeTransition();
        fadeMostrar.setDuration(fadeDuration);
        fadeMostrar.setFromValue(0);
        fadeMostrar.setToValue(fadeOpacityMax);
        fadeMostrar.setNode(labelSobremesa);
        fadeMostrar.play();
    }

    @FXML
    public void esconderTextoSobremesa() {
        FadeTransition fadeEsconder = new FadeTransition();
        fadeEsconder.setDuration(fadeDuration);
        fadeEsconder.setFromValue(fadeOpacityMax);
        fadeEsconder.setToValue(0);
        fadeEsconder.setNode(labelSobremesa);
        fadeEsconder.play();
    }

    @FXML
    public void mostrarTextoAlmocoJantar() {
        FadeTransition fadeMostrar = new FadeTransition();
        fadeMostrar.setDuration(fadeDuration);
        fadeMostrar.setFromValue(0);
        fadeMostrar.setToValue(fadeOpacityMax);
        fadeMostrar.setNode(labelsAlmocoJantar);
        fadeMostrar.play();
    }

    @FXML
    public void esconderTextoAlmocoJantar() {
        FadeTransition fadeEsconder = new FadeTransition();
        fadeEsconder.setDuration(fadeDuration);
        fadeEsconder.setFromValue(fadeOpacityMax);
        fadeEsconder.setToValue(0);
        fadeEsconder.setNode(labelsAlmocoJantar);
        fadeEsconder.play();
    }

    @FXML
    public void botaoCafeDaManha() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaCafeDaManha.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void botaoSobremesa() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaSobremesa.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @FXML
    public void botaoAlmocoJantar() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaAlmocoJantar.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @FXML
    public void botaoAcessarMenu() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaMenuDeOpcoes.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        apresentacao.setText("Olá, " + UsuarioDados.usuarioLogado.getNome() + "! Qual refeição você deseja fazer?");
    }

}