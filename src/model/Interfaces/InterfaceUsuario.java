package model.Interfaces;

import java.util.ArrayList;

import model.Usuario;

public interface InterfaceUsuario {
    boolean checarUsuario(String usuario);
    boolean checarSenha(String senha);
    String cadastrarUsuario(Usuario U);
    String fazerLoginUsuario(String usuario, String senha);
    ArrayList<Usuario> listarUsuarios();
}
