package model;

import java.io.Serializable;
import data.IngredientesDados;


public class Ingrediente implements Serializable {
    private String nome;
    private int identificador;
    private String categoria;


    public Ingrediente(String nome, String categoria) {
        this.nome = nome;
        this.identificador = IngredientesDados.contador;
        this.categoria = categoria;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public String imprimir() {
        return "Nome: " + this.getNome() + " Id: " + this.getIdentificador() + " Categoria: " + this.getCategoria();
    }
}
