package controller.controllerTelas;

import model.Principal;
import model.Ingrediente;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import controller.ReceitasSelecionadas;
import controller.controllerIngredientes.*;

public class TelaAlmocoJantarController implements Initializable {

    ControleIngredientes ci = new ControleIngredientes();
    ArrayList<Ingrediente> listaIngredientes = ci.listarIngredientes();

    @FXML
    private HBox boxIngredientes;
    private ArrayList<CheckBox> checks = new ArrayList<>();

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
    public void botaoConcluir() {
        ArrayList<Ingrediente> listaIngredientesTotais = new ArrayList<>();
        ArrayList<Integer> listaIngredientesTotaisID = new ArrayList<>();
        try {
            for (CheckBox cb : checks) {
                if (cb.isSelected()) { // coloquei pois tava voltando os id e nomes de todos e não só dos selecionados
                    for (int i = 0; i < listaIngredientes.size(); i++) {
                        if (Integer.parseInt(cb.getId()) == listaIngredientes.get(i).getIdentificador()) {
                            listaIngredientesTotais.add(listaIngredientes.get(i));
                            listaIngredientesTotaisID.add(listaIngredientes.get(i).getIdentificador());
                        }
                    }
                }
            }
            ReceitasSelecionadas.ingredientesSelecionadosID = listaIngredientesTotaisID;
            Principal.telaMenuAnterior = "TelaAlmocoJantar";
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaReceitas.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }

        try {
            Principal.root = FXMLLoader.load(getClass().getResource("/view/TelaReceitas.fxml"));
            Scene scene = new Scene(Principal.root);
            Principal.palco.setScene(scene);
        } catch (Exception e) {
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Ingrediente> listaIngredientes = new ArrayList<>();

        try {
            listaIngredientes = ci.listarIngredientes();
        } catch (Exception e) {
        }

        VBox vb1 = new VBox();
        VBox vb2 = new VBox();
        VBox vb3 = new VBox();
        String style = "-fx-spacing: 30; -fx-pref-width: 270; -fx-alignment: center;";
        vb1.setStyle(style);
        vb2.setStyle(style);
        vb3.setStyle(style);
        for (int i = 0; i < listaIngredientes.size(); i++) {
            Ingrediente ing = listaIngredientes.get(i);

            if (ing.getCategoria().contains("almoco")) {
                CheckBox cb = new CheckBox();
                cb.setStyle("-fx-text-fill: #fff; -fx-font-size: 24; -fx-pref-width: 270;");
                cb.setText(ing.getNome());
                cb.setId(ing.getIdentificador() + "");

                checks.add(cb);
            }
        }
        for (int i = 0; i < checks.size(); i++) {
            if (i % 3 == 0) {
                vb1.getChildren().add(checks.get(i));
            } else if (i % 2 == 0) {
                vb2.getChildren().add(checks.get(i));
            } else {
                vb3.getChildren().add(checks.get(i));
            }
        }
        boxIngredientes.getChildren().setAll(vb1, vb2, vb3);
    }

}