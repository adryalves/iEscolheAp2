package model.Interfaces;

import java.util.ArrayList;

import model.Receita;

public interface InterfaceReceita {
    void cadastrarReceita(Receita R);
    void salvarQuantidadeReceitas();
    ArrayList<Receita> listarReceitas();
}
