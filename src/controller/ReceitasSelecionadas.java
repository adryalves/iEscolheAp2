package controller;

import java.util.ArrayList;
import controller.controllerReceita.ControleReceita;
import model.Receita;

public class ReceitasSelecionadas {

    static ControleReceita cr = new ControleReceita();

    public static ArrayList<Integer> ingredientesSelecionadosID = new ArrayList<>();
    static ArrayList<Receita> receitas = cr.listarReceitas();

    public static ArrayList<Receita> receitasPossiveis() {
        ArrayList<Receita> result = new ArrayList<>();

        for (Receita r : receitas) {
            int count = 0;
            for (int idIngrediente : r.getIngredientesId()) {
                if (ingredientesSelecionadosID.contains(idIngrediente)) {
                    count++;
                }
            }

            if (count == r.getIngredientes().size()) {
                result.add(r);
            }

        }

        return result;
    }
}
