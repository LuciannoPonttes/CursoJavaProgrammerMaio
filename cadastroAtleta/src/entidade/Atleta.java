package entidade;

public class Atleta {
	
	public String nome; // Cadeia de qualquer caracter
	public int idade; // Apenas para numero inteiro
	public int qtdPartida;
	public double salario;// numeros com casas decimais - ex: 10.5
	
	
	//Construtor
	
	public Atleta(String nome,int idade, int qtdPartida, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.qtdPartida = qtdPartida;
		this.salario = salario;	
	}

	public Atleta() {

	}
	
	public Atleta(String nome) {
		this.nome = nome;
		
	}

	public Atleta(String nome, int idade, int qtdPartida) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.qtdPartida = qtdPartida;
	}
	
	
	
	

}
