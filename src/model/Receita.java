package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import controller.ControleAvaliacao;
import data.IngredienteReceitaDados;
import data.IngredientesDados;
import data.ReceitaDados;



public class Receita implements Serializable {
    // Atributos
    private String nome;
    private int identificador;
    private String modoPreparo;
    private int avaliacao;
    private String fonte;
    private boolean favorito;

    // Construtor

    public Receita(String nome, String modoPreparo) {
        this.nome = nome;
        this.identificador = ReceitaDados.contador;
        this.modoPreparo = modoPreparo;
        this.fonte = "Tudo Gostoso";
        this.favorito = false;
    }

    // Metodos

    public double mediaAvaliacao(){
        ControleAvaliacao ca = new ControleAvaliacao();
        double media = 0;
        int quantidadeAvaliacoes = 0;
        for(Avaliacao a : ca.listarAvaliacoes()){
            if(a.getIdReceita() == this.identificador){     //ve se nao da pra otimizar isso.....
                media += a.getAvaliacao();
                quantidadeAvaliacoes++;
            }
        }

        
        double mediaReceita = media / quantidadeAvaliacoes;
        BigDecimal bd = new BigDecimal(mediaReceita).setScale(1, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }


    // Getter & Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    IngredienteReceitaDados ird = new IngredienteReceitaDados();

    public ArrayList<Integer> getIngredientesId() {
        ArrayList<Integer> ingredientes = new ArrayList<>();

        for (IngredienteReceita ir : ird.listarIngredienteReceitas()) {
            if (ir.getIdReceita() == this.identificador) {
                ingredientes.add(ir.getIdIngrediente());
            }
        }

        return ingredientes;
    }

    public ArrayList<String> getIngredientes() {
        ArrayList<String> ingredientes = new ArrayList<>();

        for (IngredienteReceita ir : ird.listarIngredienteReceitas()) {
            if (ir.getIdReceita() == this.identificador) {
                for (Ingrediente i : ii.listarIngredientes()) {
                    if (i.getIdentificador() == ir.getIdIngrediente()) {
                        ingredientes.add(i.getNome() + " - " + ir.getQuantidade());
                    }
                }
            }
        }

        return ingredientes;
    }

    IngredientesDados ii = new IngredientesDados();
    
}