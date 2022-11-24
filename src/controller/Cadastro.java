package controller;

public class Cadastro {

    static ControleCadastro c = new ControleCadastro();
    
    public static void main(String[] args) {

	c.cadastrarReceita();
	c.cadastrarIngrediente();
	c.cadastrarIngredienteReceita();
    c.cadastrarAvaliacao();

    }

}
