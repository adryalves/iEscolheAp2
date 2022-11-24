package controller;

import java.util.ArrayList;

import data.*;
import model.*;
import model.Interfaces.*;

public class ControleUsuario {
    InterfaceUsuario ud = new UsuarioDados();

    public String cadastrarUsuario(String nome, String usuario, String senha) {
        Usuario u = new Usuario(nome, usuario, senha);
        return ud.cadastrarUsuario(u);
    }

    public String fazerLoginUsuario(String usuario, String senha) {
        return ud.fazerLoginUsuario(usuario, senha);
    }

    public ArrayList<Usuario> listarUsuarios() {
        return ud.listarUsuarios();
    }
}