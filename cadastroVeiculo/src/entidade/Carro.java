package entidade;

//Quando uma classe extende uma classe pai ou super Classe
public class Carro extends Veiculo {
	
	private String numeroPortas;
	private double preco;//não pode ser String

	public String getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(String numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public Carro() {
		super();	
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	

}
