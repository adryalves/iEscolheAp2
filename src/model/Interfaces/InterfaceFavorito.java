package model.Interfaces;

import java.util.ArrayList;

import model.Favorito;

public interface InterfaceFavorito {

    void cadastrarFavorito(String usuario, int idReceita);

    void removerFavorito(String usuario, int idReceita);

    ArrayList<Favorito> listarFavoritos();

}
