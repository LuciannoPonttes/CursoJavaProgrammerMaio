package interacaoUsuario;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {

	
	public void menuInicial() {
		
		
		CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();
		
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para CARRO e Qualquer Tecla para Moto:"));
		
		/*
		if(opcao == 1) { // SE A OPÇÃO DIGITADA FOR 1
			cadastroVeiculo.cadastrarCarro();// VAI EXECUTAR ESSA LINHA
		}
		if(opcao == 2) {
			cadastroVeiculo.cadastroMoto();
		}*/
		
		if(opcao != 1 || opcao != 2) {
				JOptionPane.showMessageDialog(null, "Insira 1 ou 2");
		}
		
		
	}

}
