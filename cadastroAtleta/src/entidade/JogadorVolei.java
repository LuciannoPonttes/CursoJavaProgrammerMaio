package entidade;

public class JogadorVolei extends Atleta  {
	
	int qtdPonto;

	public JogadorVolei(String nome, int idade, int qtdPartida, double salario, int qtdPonto) {
		super(nome, idade, qtdPartida, salario);
		this.qtdPonto = qtdPonto;
	}

	public JogadorVolei(int qtdPonto) {
		super();
		this.qtdPonto = qtdPonto;
	}

	public JogadorVolei(String nome, int idade, int qtdPartida, int qtdPonto) {
		super(nome, idade, qtdPartida);
		this.qtdPonto = qtdPonto;
	}

	public JogadorVolei() {
		super();
	}
	
	
	
	
	
	
	
 
}
