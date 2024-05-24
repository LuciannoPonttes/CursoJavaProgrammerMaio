package entidade;

public class JogadorFutebol extends Atleta  {
	
	public JogadorFutebol(String nome) {
		super(nome);// Atributo da classe pai
	}

	private int qtdGols;

	public int getQtdGols() {
		return qtdGols;
	}

	public void setQtdGols(int qtdGols) {
		this.qtdGols = qtdGols;
	}




	
	

}
