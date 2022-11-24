package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Principal extends Application {

    public static Parent root;
    public static Stage palco = new Stage();
    public static String telaAnterior = "";
    public static String telaMenuAnterior = "";

    @Override
    public void start(Stage palco) throws Exception {
        root = FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml"));
        Scene scene = new Scene(root);
        Principal.palco.setTitle("iEscolhe");
        Principal.palco.getIcons().add(new Image("/view/images/logo-vermelha.png"));
        Principal.palco.setScene(scene);
        Principal.palco.setResizable(false);
        Principal.palco.sizeToScene();
        Principal.palco.centerOnScreen();
        Principal.palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}