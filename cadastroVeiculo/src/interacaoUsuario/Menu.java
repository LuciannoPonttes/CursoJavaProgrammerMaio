package interacaoUsuario;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {

	
	public void menuInicial() {
		
		
		CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();
		
		
		int opcao;
		
		boolean menuResultado = true; // somente verdadeiro ou falso
		
		// tudo que está dentro do while vai se repetir enquanto(while) a variavel menuResultado for true(verdadeiro)
		while (menuResultado) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para CARRO  Digite 2 para moto e 3 para Encerrar"));
			
			switch (opcao) { // Verificar o valor da variavel opcao
			case 1: { // Caso for 1 entra nesse caso
				cadastroVeiculo.cadastrarCarro();// VAI EXECUTAR ESSA LINHA
				break;
			}
			case 2: { //Caso for 2 entra nesse caso
				cadastroVeiculo.cadastroMoto();
				break;
			}
			case 3: { //Caso for 2 entra nesse caso
				System.exit(0);
				break;
			}
			default: // Se não for nenhuma opcao entra aqui
				JOptionPane.showMessageDialog(null, "Insira 1 ou 2");
			
				break;
			}
			
			
			if(opcao == 1 || opcao == 2) {
				menuResultado = false;
			}
			
		}
		
		/*USANDO O MENU COM IF
		if(opcao == 1) { // SE A OPÇÃO DIGITADA FOR 1
			cadastroVeiculo.cadastrarCarro();// VAI EXECUTAR ESSA LINHA
		}
		if(opcao == 2) {
			cadastroVeiculo.cadastroMoto();
		}
		
		if(opcao != 1 || opcao != 2) {
				JOptionPane.showMessageDialog(null, "Insira 1 ou 2");
		}
		*/
		
	
		
	}// FIM

}
