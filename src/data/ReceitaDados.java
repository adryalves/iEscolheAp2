package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.*;
import model.Interfaces.InterfaceReceita;

public class ReceitaDados implements InterfaceReceita {

    public static int contador = 0;

    public void cadastrarReceita(Receita R) {
        try {
            FileOutputStream fluxo = new FileOutputStream("receitas.txt", true);
            ObjectOutputStream obs = new ObjectOutputStream(fluxo);
            obs.writeObject(R);
            obs.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo receitas nao encontrado");
        } catch (IOException e) {
            System.out.println("Erro ao cadastrar Receita");
        }
    }

    public ArrayList<Receita> listarReceitas() {
        ArrayList<Receita> lista = new ArrayList<>();
        try {
            FileInputStream fluxo = new FileInputStream("receitas.txt");
            ObjectInputStream obs;

            while (fluxo.available() > 0) {
                obs = new ObjectInputStream(fluxo);
                Receita R = (Receita) obs.readObject();
                lista.add(R);
            }

            fluxo.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("Erro ao imprimir Receita pois o arquivo não foi encontrado");
        } catch (IOException io) {
            System.out.println("Erro ao imprimir Receita pois pois ocorreu uma exceção");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Erro ao imprimir Receita pois a classe não foi encontrado");
        }

        return lista;
    }

    public void salvarQuantidadeReceitas() {
        File arquivo = new File("quantidade_receitas.txt");
        try {
            contador++;
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Integer.toString(contador));
            bw.close();
            fw.close();
        } catch (Exception ex) {
            System.out.println("Erro ao salvar quantidade de Receitas");
        }
    }

}
