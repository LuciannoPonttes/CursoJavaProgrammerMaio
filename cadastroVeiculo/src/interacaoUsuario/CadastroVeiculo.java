package interacaoUsuario;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidade.Carro;
import entidade.Moto;

public class CadastroVeiculo {
	
	public Carro cadastrarCarro() {
		
		Carro carroEntidade = new Carro();
		
		carroEntidade.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
		System.out.println("Digite o marcar: ");
		
		carroEntidade.setMarca(JOptionPane.showInputDialog("Digite o marcar: "));
		carroEntidade.setCor(JOptionPane.showInputDialog("Digite a cor: "));
		carroEntidade.setNumeroPortas("Digite a quantidade Portas: ");
		
		return carroEntidade;
		
		
	}
	
	
	public Moto cadastroMoto() {
		Moto motoEntidade = new Moto();
		
		motoEntidade.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
		motoEntidade.setMarca(JOptionPane.showInputDialog("Digite o marcar: "));
		motoEntidade.setCor(JOptionPane.showInputDialog("Digite a cor: "));
		motoEntidade.setTipoGuidao(JOptionPane.showInputDialog("Digite o tipo do Guidao: "));
		
		return motoEntidade;
		
		
	}
	
	public void imprimirMoto(List<Moto> listaMotos) {
		
		StringBuilder impressaoMotosString = new StringBuilder();
		
		for(Moto motoItemLista:listaMotos) {
			impressaoMotosString.append("Modelo: ").append(motoItemLista.getModelo()).append("\n")
								.append("Marca: ").append(motoItemLista.getMarca()).append("\n")
								.append("COR: ").append(motoItemLista.getCor()).append("\n")
								.append("TIPO GUIDAO: ").append(motoItemLista.getTipoGuidao()).append("\n")
								.append("_____________________________").append("\n");
		
		
		}
		
		
		JOptionPane.showMessageDialog(null, impressaoMotosString.toString());
		
	}
	
	
	public void imprimirCarro(List<Carro> listaCarros) {
		
		StringBuilder impressaoMotosString = new StringBuilder();
		
		for(Carro carroItemLista: listaCarros) {
			impressaoMotosString.append("Modelo: ").append(carroItemLista.getModelo()).append("\n")
								.append("Marca: ").append(carroItemLista.getMarca()).append("\n")
								.append("COR: ").append(carroItemLista.getCor()).append("\n")
								.append("TIPO GUIDAO: ").append(carroItemLista.getNumeroPortas()).append("\n")
								.append("_____________________________").append("\n");
		
		
		}
		
		
		JOptionPane.showMessageDialog(null, impressaoMotosString.toString());
		
	}
	
	
	
	
	
	
	/*
	 * JOptionPane.showMessageDialog(null, 
	    "MODELO: " + motoEntidade.getModelo() + "\n" +
	    "MARCA: " + motoEntidade.getMarca() + "\n" +
	    "COR: " + motoEntidade.getCor() + "\n" +
	    "TIPOGUIDAO: " + motoEntidade.getTipoGuidao()
	);
	 */
	

}
