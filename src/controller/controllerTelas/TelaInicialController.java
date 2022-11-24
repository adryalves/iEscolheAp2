package controller.controllerTelas;

import model.Principal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
// import java.util.concurrent.Executors;
// import java.util.concurrent.ScheduledExecutorService;
// import java.util.concurrent.TimeUnit;
// import javafx.application.Platform;

public class TelaInicialController implements Initializable {

    @FXML
    public void botaoComecar() {
        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaLogin.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        // executor.schedule(new Runnable() {
        // @Override
        // public void run() {
        // System.out.println("depois");
        // abrirLogin();
        // }
        // }, 1500, TimeUnit.MILLISECONDS);
    }

    // public void abrirLogin() {
    // Platform.runLater(new Runnable() {
    // @Override
    // public void run() {
    // try {
    // Principal.root =
    // FXMLLoader.load(getClass().getResource("/view/TelaLogin.fxml"));
    // Scene scene = new Scene(Principal.root);
    // Principal.palco.setScene(scene);
    // Principal.palco.close();
    // Principal.palco.show();
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    // }
    // });
    // }

}