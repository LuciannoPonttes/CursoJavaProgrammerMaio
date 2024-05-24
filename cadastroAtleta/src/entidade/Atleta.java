package entidade;

public abstract class  Atleta {
	
	
	private String nome; // Cadeia de qualquer caracter
	private int idade; // Apenas para numero inteiro
	private int qtdPartida;
	private double salario;// numeros com casas decimais - ex: 10.5
	
	public Atleta(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}

}
