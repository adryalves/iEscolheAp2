package data;

import model.Avaliacao;
import model.Interfaces.InterfaceAvaliacao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AvaliacaoDados implements InterfaceAvaliacao {

    public void cadastrarAvaliacao(Avaliacao A) {
        try {
            FileOutputStream fluxo = new FileOutputStream("avaliacoes.txt", true);
            ObjectOutputStream obs = new ObjectOutputStream(fluxo);
            obs.writeObject(A);
            obs.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao cadastrar Avaliacao");
        } catch (IOException e) {
            System.out.println("Erro ao cadastrar Avaliacao");
        }
    }

    public ArrayList<Avaliacao> listarAvaliacoes() {
        ArrayList<Avaliacao> lista = new ArrayList<>();
        try {
            FileInputStream fluxo = new FileInputStream("avaliacoes.txt");
            ObjectInputStream obs;

            while (fluxo.available() > 0) {
                obs = new ObjectInputStream(fluxo);

                Avaliacao A = (Avaliacao) obs.readObject();
                lista.add(A);
            }

            fluxo.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("Erro ao imprimir Avaliacao pois o arquivo não foi encontrado");
        } catch (IOException io) {
            System.out.println("Erro ao imprimir Avaliacao pois pois ocorreu uma exceção");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Erro ao imprimir Avaliacao pois a classe não foi encontrado");
        }

        return lista;
    }

}
