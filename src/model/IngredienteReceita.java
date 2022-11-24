package model;

import java.io.Serializable;

public class IngredienteReceita implements Serializable {
    
    //Atributos
    private int idIngrediente;
    private int idReceita;
    private String quantidade;
    private String identificador;

   
    //Construtor
    public IngredienteReceita(int idIngrediente, int idReceita, String quantidade) {
        this.idIngrediente = idIngrediente;
        this.idReceita = idReceita;
        this.quantidade = quantidade;
        this.identificador = idIngrediente + "-" + idReceita;
    }

    //Metodos

    public String imprimir() {
        return "idIngrediente: " + this.getIdIngrediente() + " idReceita: " + this.getIdReceita() + " Quantidade: " + this.getQuantidade();
    }


    //Getter & Setter
    public int getIdIngrediente() {
        return idIngrediente;
    }


    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getIdReceita() {
        return idReceita;
    }


    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public String getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }


}               
