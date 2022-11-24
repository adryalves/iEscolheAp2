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
import java.io.Serializable;
import java.util.ArrayList;
import model.Ingrediente;
import model.Interfaces.InterfaceIngrediente;

public class IngredientesDados implements InterfaceIngrediente, Serializable {

    public static int contador = 0;

    public void cadastrarIngrediente(Ingrediente I) {
        try {
            FileOutputStream fluxo = new FileOutputStream("ingredientes.txt", true);
            ObjectOutputStream obs = new ObjectOutputStream(fluxo);
            obs.writeObject(I);
            obs.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao cadastrar Ingrediente");
        } catch (IOException e) {
            System.out.println("Erro ao cadastrar Ingrediente");
        }
    }

    public void salvarQuantidadeIngredientes() {
        File arquivo = new File("quantidade_ingredientes.txt");
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
            System.out.println("Erro ao salvar quantidade de Ingredientes");
        }
    }

    public ArrayList<Ingrediente> listarIngredientes() {
        ArrayList<Ingrediente> lista = new ArrayList<>();
        try {
            FileInputStream fluxo = new FileInputStream("ingredientes.txt");
            ObjectInputStream obs;

            while (fluxo.available() > 0) {
                obs = new ObjectInputStream(fluxo);

                Ingrediente I = (Ingrediente) obs.readObject();
                lista.add(I);
            }

            fluxo.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("Erro ao imprimir Ingrediente pois o arquivo não foi encontrado");
        } catch (IOException io) {
            System.out.println("Erro ao imprimir Ingrediente pois pois ocorreu uma exceção");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Erro ao imprimir Ingrediente pois a classe não foi encontrado");
        }

        return lista;
    }
}
