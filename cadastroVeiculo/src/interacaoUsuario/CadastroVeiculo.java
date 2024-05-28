package interacaoUsuario;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entidade.Carro;
import entidade.Moto;

public class CadastroVeiculo {
	
	public void cadastrarCarro() {
		
		Carro carroEntidade = new Carro();
		
		carroEntidade.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
		System.out.println("Digite o marcar: ");
		
		carroEntidade.setMarca(JOptionPane.showInputDialog("Digite o marcar: "));
		carroEntidade.setCor(JOptionPane.showInputDialog("Digite a cor: "));
		carroEntidade.setNumeroPortas("Digite a quantidade Portas: ");
		
		System.out.println("MODELO: " + carroEntidade.getModelo());
		System.out.println("MARCA: " + carroEntidade.getMarca());
		System.out.println("COR: " + carroEntidade.getCor());
		

	}
	
	
	public void cadastroMoto() {
		Moto motoEntidade = new Moto();
		
		motoEntidade.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
		motoEntidade.setMarca(JOptionPane.showInputDialog("Digite o marcar: "));
		motoEntidade.setCor(JOptionPane.showInputDialog("Digite a cor: "));
		motoEntidade.setTipoGuidao(JOptionPane.showInputDialog("Digite o tipo do Guidao: "));
		
		JOptionPane.showMessageDialog(null, "MODELO:" + motoEntidade.getModelo() + "\n"+
				"MARCA: " + motoEntidade.getMarca() + "\n" +
				"COR: " + motoEntidade.getCor() + "\n"+
				"TIPO GUIDAO: " + motoEntidade.getTipoGuidao()
				);
		
		
	}
	
	
	

}
