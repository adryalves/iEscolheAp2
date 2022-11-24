package controller.controllerReceita;

import java.util.ArrayList;
import model.*;
import model.Interfaces.InterfaceReceita;
import data.*;

public class ControleReceita {

    InterfaceReceita rd = new ReceitaDados();

    public void cadastrarReceitas(String nome, String modoPreparo) {
        Receita R = new Receita(nome, modoPreparo);
        rd.cadastrarReceita(R);
        rd.salvarQuantidadeReceitas();
    }

    public ArrayList<Receita> listarReceitas() {
        return rd.listarReceitas();
    }

}
