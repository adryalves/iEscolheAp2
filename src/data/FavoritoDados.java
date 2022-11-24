package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.File;
import model.Favorito;
import model.Interfaces.InterfaceFavorito;

public class FavoritoDados implements InterfaceFavorito {

    public void cadastrarFavorito(String usuario, int idReceita) {
        for (Favorito f : listarFavoritos()) {
            if (f.getIdReceita() == idReceita && f.getUsuario().equals(usuario)) {
                return;
            }
        }

        try {
            FileOutputStream fluxo = new FileOutputStream("favoritos.txt", true);
            ObjectOutputStream obs = new ObjectOutputStream(fluxo);
            obs.writeObject(new Favorito(usuario, idReceita));
            obs.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo favoritos nao encontrado");
        } catch (IOException e) {
            System.out.println("Erro ao cadastrar Favoritos");
        }
    }

    public void removerFavorito(String usuario, int idReceita) {
        System.out.println("removendo");
        ArrayList<Favorito> favoritos = listarFavoritos();
        System.out.println("listando");

        File file = new File("favoritos.txt");
        file.delete();

        for (Favorito f : favoritos) {
            if (f.getIdReceita() != idReceita || !f.getUsuario().equals(usuario)) {
                cadastrarFavorito(f.getUsuario(), f.getIdReceita());
            }
        }
    }

    public ArrayList<Favorito> listarFavoritos() {
        ArrayList<Favorito> lista = new ArrayList<>();
        try {
            FileInputStream fluxo = new FileInputStream("favoritos.txt");
            ObjectInputStream obs;

            while (fluxo.available() > 0) {
                obs = new ObjectInputStream(fluxo);

                Favorito F = (Favorito) obs.readObject();
                lista.add(F);
            }

            fluxo.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("Erro ao imprimir Favoritos pois o arquivo não foi encontrado");
        } catch (IOException io) {
            System.out.println(io);
            System.out.println("Erro ao imprimir Favoritos pois pois ocorreu uma exceção");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Erro ao imprimir Favoritos pois a classe não foi encontrado");
        }

        return lista;
    }

    public ArrayList<Integer> listarReceitasFavoritas(String usuario) {
        ArrayList<Integer> lista = new ArrayList<>();
        try {
            FileInputStream fluxo = new FileInputStream("favoritos.txt");
            ObjectInputStream obs;

            while (fluxo.available() > 0) {
                obs = new ObjectInputStream(fluxo);

                Favorito F = (Favorito) obs.readObject();
                if (F.getUsuario().equals(usuario))
                    lista.add(F.getIdReceita());
            }

            fluxo.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("Erro ao imprimir Favoritos pois o arquivo não foi encontrado");
        } catch (IOException io) {
            System.out.println(io);
            System.out.println("Erro ao imprimir Favoritos pois pois ocorreu uma exceção");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Erro ao imprimir Favoritos pois a classe não foi encontrado");
        }

        return lista;
    }
}
