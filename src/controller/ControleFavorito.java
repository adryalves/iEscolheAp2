package controller;

import java.util.ArrayList;

import data.FavoritoDados;
import model.Favorito;
import model.Interfaces.InterfaceFavorito;

public class ControleFavorito {

    InterfaceFavorito fd = new FavoritoDados();

    public void cadastrarFavorito(String usuario, int idReceita) {
        fd.cadastrarFavorito(usuario, idReceita);
    }

    public ArrayList<Favorito> listarFavoritos() {
        return fd.listarFavoritos();
    }

    public String imprimir() {
        String res = "";
        ArrayList<Favorito> disc = listarFavoritos();
        for (int i = 0; i < disc.size(); i++) {
            res += disc.get(i).imprimir() + "\n---------\n";
        }
        return res;
    }

}
