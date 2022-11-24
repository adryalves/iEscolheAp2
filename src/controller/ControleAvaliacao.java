package controller;

import java.util.ArrayList;

import data.AvaliacaoDados;
import model.Avaliacao;
import model.Interfaces.InterfaceAvaliacao;

public class ControleAvaliacao {

    InterfaceAvaliacao ia = new AvaliacaoDados();
    
    public void cadastrarAvaliacao(String usuario, int avaliacao, int idReceita) {
        Avaliacao UA = new Avaliacao(usuario, avaliacao, idReceita);
        ia.cadastrarAvaliacao(UA);
    }

    public ArrayList<Avaliacao> listarAvaliacoes(){
        return ia.listarAvaliacoes();
    }

    public int quantidadeAvaliacoes(){
        return listarAvaliacoes().size();
    }

    public int somaAvaliacoes(){
        int soma = 0;
        for(Avaliacao a : listarAvaliacoes()){
            soma += a.getAvaliacao();
        }
        return soma;
    }

}
