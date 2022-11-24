package model.Interfaces;

import java.util.ArrayList;

import model.Avaliacao;

public interface InterfaceAvaliacao {
    void cadastrarAvaliacao(Avaliacao UA);
    ArrayList<Avaliacao> listarAvaliacoes();
}
