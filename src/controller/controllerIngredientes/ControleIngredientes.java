package controller.controllerIngredientes;

import java.util.ArrayList;
import data.IngredientesDados;
import model.Ingrediente;
import model.Interfaces.*;

public class ControleIngredientes {

    InterfaceIngrediente id = new IngredientesDados();

    public void cadastrarIngredientes(String nome, String categoria) {
        Ingrediente I = new Ingrediente(nome, categoria);
        id.cadastrarIngrediente(I);
        id.salvarQuantidadeIngredientes();
    }

    public ArrayList<Ingrediente> listarIngredientes() {
        return id.listarIngredientes();
    }

    public String imprimir() {
        String res = "";
        ArrayList<Ingrediente> disc = listarIngredientes();
        for (int i = 0; i < disc.size(); i++) {
            res += disc.get(i).imprimir() + "\n---------\n";
        }
        return res;
    }

}
