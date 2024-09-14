package br.com.gabriel;

/*
  	Classe aluno onde nela sao inserida as propriedades
	nome, endereço e idade de um objeto aluno que tem como 
	métodos os getters e setters e o cadastro. 
*/
public class Aluno {
	
	private String nome;
	
	private String endereco;
	
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}
	
	// Getters e Setters
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// Método para cadastrar um novo aluno
	public void cadastrarAluno() {
		setNome(nome);
		setEndereco(endereco);
		setIdade(idade);
	}
}
