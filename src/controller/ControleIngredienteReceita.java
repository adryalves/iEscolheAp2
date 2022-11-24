package controller;

import java.util.ArrayList;

import data.IngredienteReceitaDados;
import model.IngredienteReceita;
import model.Interfaces.InterfaceIngredienteReceita;

public class ControleIngredienteReceita {
    
    InterfaceIngredienteReceita ird = new IngredienteReceitaDados();

    public void cadastrarIngredienteReceita(int idIngrediente, int idReceita, String quantidade) {
        IngredienteReceita ir = new IngredienteReceita(idIngrediente, idReceita, quantidade);
        ird.cadastrarIngredienteReceita(ir);
        ird.salvarQuantidadeIngredienteReceita();
    }

    public ArrayList<IngredienteReceita> listarIngredienteReceitas() {
        return ird.listarIngredienteReceitas();
    }

    public String imprimir() {
        String res = "";
        ArrayList<IngredienteReceita> disc = listarIngredienteReceitas();
        for (int i = 0; i < disc.size(); i++) {
            res += disc.get(i).imprimir() + "\n---------\n";
        }
        return res;
    }
}
