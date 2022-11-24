package model.Interfaces;

import java.util.ArrayList;
import model.Ingrediente;

public interface InterfaceIngrediente {
    void cadastrarIngrediente(Ingrediente I);
    void salvarQuantidadeIngredientes();
    ArrayList<Ingrediente> listarIngredientes();
}
