package model.Interfaces;

import java.util.ArrayList;

import model.IngredienteReceita;

public interface InterfaceIngredienteReceita {
    void cadastrarIngredienteReceita(IngredienteReceita IR);
    void salvarQuantidadeIngredienteReceita();
    ArrayList<IngredienteReceita> listarIngredienteReceitas();
}
