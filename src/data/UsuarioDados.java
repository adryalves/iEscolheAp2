package data;

import model.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Interfaces.InterfaceUsuario;

public class UsuarioDados implements InterfaceUsuario {

    public static Usuario usuarioLogado = null;

    public boolean checarUsuario(String usuario) {
        for (Usuario u : listarUsuarios()) {
            if (u.getUsuario().equals(usuario)) {
                return false;
            }
        }
        return true;
    }

    public boolean checarSenha(String senha) {
        boolean checagem_senha = true;
        if (senha.length() < 6) { // Checando se a senha possui no mínimo 6 caracteres
            checagem_senha = false;
        }
        return checagem_senha;
    }

    public String cadastrarUsuario(Usuario u) {
        String resultado = "";

        if (checarUsuario(u.getUsuario()) == true && checarSenha(u.getSenha()) == true) {
            // Só vai cadastrar se os dois métodos anteriores retornarem true,
            // ou seja se cumprem os requistos de checagem

            try {
                FileOutputStream fluxo = new FileOutputStream("usuarios.txt", true);
                ObjectOutputStream obs = new ObjectOutputStream(fluxo);
                obs.writeObject(u);
                obs.close();
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo usuários não encontrado");
            } catch (IOException e) {
                System.out.println("Erro ao cadastrar usuário");
            }
            usuarioLogado = u;

            resultado = "";
        } else if (checarUsuario(u.getUsuario()) == false) {
            resultado = "Usuário já existe";
        } else if (checarSenha(u.getSenha()) == false) {
            resultado = "Senha deve ter pelo menos 6 caracteres";
        }

        return resultado;
    }

    public String fazerLoginUsuario(String usuario, String senha) {
        for (Usuario u : listarUsuarios()) {
            if (u.getUsuario().equals(usuario)) {
                if (u.getSenha().equals(senha)) {
                    usuarioLogado = u;
                    return "";
                } else
                    return "Senha incorreta";
            }
        }
        return "Usuário não encontrado";
    }

    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            FileInputStream fluxo = new FileInputStream("usuarios.txt");
            ObjectInputStream obs;

            while (fluxo.available() > 0) {
                obs = new ObjectInputStream(fluxo);

                Usuario U = (Usuario) obs.readObject();
                lista.add(U);
            }

            fluxo.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("Erro ao imprimir Usuario pois o arquivo não foi encontrado");
        } catch (IOException io) {
            System.out.println("Erro ao imprimir Usuario pois pois ocorreu uma exceção");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Erro ao imprimir Usuario pois a classe não foi encontrado");
        }

        return lista;
    }

}
