package entidade;

public class JogadorFutebol extends Atleta  {
	
	int qtdGols;

	public JogadorFutebol(String nome, int idade, int qtdPartida, double salario, int qtdGols) {
		super(nome, idade, qtdPartida, salario); // Indica que está usando dados da classe pai
		this.qtdGols = qtdGols;
	}

	public JogadorFutebol() {
		super();
	}
	
	

	
	
	

}
