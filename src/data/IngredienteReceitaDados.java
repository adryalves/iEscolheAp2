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
import model.IngredienteReceita;
import model.Interfaces.InterfaceIngredienteReceita;

public class IngredienteReceitaDados implements InterfaceIngredienteReceita, Serializable {

    public static int contador = 0;

    public void cadastrarIngredienteReceita(IngredienteReceita IR) {
        try {
            FileOutputStream fluxo = new FileOutputStream("ingredientes_receitas.txt", true);
            ObjectOutputStream obs = new ObjectOutputStream(fluxo);
            obs.writeObject(IR);
            obs.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao cadastrar IngredienteReceita");
        } catch (IOException e) {
            System.out.println("Erro ao cadastrar IngredienteReceita");
        }
    }

    public void salvarQuantidadeIngredienteReceita() {
        File arquivo = new File("quantidade_ingredientes_receitas.txt");
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
            System.out.println("Erro ao salvar quantidade de Ingrediente-Receita");
        }
    }

    public ArrayList<IngredienteReceita> listarIngredienteReceitas() {
        ArrayList<IngredienteReceita> lista = new ArrayList<>();
        try {
            FileInputStream fluxo = new FileInputStream("ingredientes_receitas.txt");
            ObjectInputStream obs;

            while (fluxo.available() > 0) {
                obs = new ObjectInputStream(fluxo);

                IngredienteReceita IR = (IngredienteReceita) obs.readObject();
                lista.add(IR);
            }

            fluxo.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("Erro ao imprimir IngredienteReceita pois o arquivo não foi encontrado");
        } catch (IOException io) {
            System.out.println("Erro ao imprimir IngredienteReceita pois pois ocorreu uma exceção");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Erro ao imprimir IngredienteReceita pois a classe não foi encontrado");
        }

        return lista;
    }

}
