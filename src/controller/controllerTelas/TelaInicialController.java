package controller.controllerTelas;

import model.Principal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

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
    }
}