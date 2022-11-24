package model;

import java.io.Serializable;

public class Avaliacao implements Serializable{
    
    //Atributos
    private String usuario;
    private int avaliacao;
    private int idReceita;

    //Construtor
    public Avaliacao(String usuario, int avaliacao, int idReceita){
        this.usuario = usuario;
        this.avaliacao = avaliacao;
        this.idReceita = idReceita;
    }

    //Metodos

    public void adicionarAvaliacao(int avaliacao){
        this.avaliacao += avaliacao;
    }


    //Getter & Setter

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }
}
