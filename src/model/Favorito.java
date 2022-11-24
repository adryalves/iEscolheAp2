package model;

import java.io.Serializable;

public class Favorito implements Serializable{
    //Atributos
    private String usuario;
    private int idReceita;

    //Construtor
    public Favorito(String usuario, int idReceita){
        this.usuario = usuario;
        this.idReceita = idReceita;
    }

    //Metodos

    //Getter & Setter  

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public String imprimir(){
        return "Usuario: " + getUsuario() + "\n Id receita:" + getIdReceita();
    }

}


