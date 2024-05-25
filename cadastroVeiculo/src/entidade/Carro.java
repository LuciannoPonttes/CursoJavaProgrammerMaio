package entidade;

//Quando uma classe extende uma classe pai ou super Classe
public class Carro extends Veiculo {
	
	private String numeroPortas;

	public String getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(String numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public Carro() {
		super();	
	}
	
	

}
