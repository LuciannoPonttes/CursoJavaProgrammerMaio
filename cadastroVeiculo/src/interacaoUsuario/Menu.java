package interacaoUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidade.Carro;
import entidade.Moto;

public class Menu {

	
	public void menuInicial() {
		
		
		CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();
		Moto motoParaAddNaLista = new Moto();
		Carro carroParaAddNaLista = new Carro();
		List<Moto> motoLista = new ArrayList<Moto>();
		List<Carro> carroLista = new ArrayList<Carro>();
		
		
		int opcao;
		
		boolean menuResultado = true; // somente verdadeiro ou falso
		
		// tudo que está dentro do while vai se repetir enquanto(while) a variavel menuResultado for true(verdadeiro)
		while (menuResultado) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para CARRO " + "\n"
					+ " Digite 2 para moto" + "\n" 
					+ " Digite 3 para listar as Motos" + "\n"
					+ " Digite 4 para listaEncerrar" + "\n"
					
					));
			
			switch (opcao) { // Verificar o valor da variavel opcao
			case 1: { // Caso for 1 entra nesse caso
				carroParaAddNaLista = cadastroVeiculo.cadastrarCarro();// VAI EXECUTAR ESSA LINHA
				carroLista.add(carroParaAddNaLista);
				break;
			}
			case 2: { //Caso for 2 entra nesse caso
				motoParaAddNaLista = cadastroVeiculo.cadastroMoto();
				motoLista.add(motoParaAddNaLista);
				
				break;
			}
			case 3: { 
				cadastroVeiculo.imprimirMoto(motoLista);
				break;
			}
			case 4: { 
				cadastroVeiculo.imprimirCarro(carroLista);
				break;
			}
			case 5: { //Caso for 2 entra nesse caso
				System.exit(0);
				break;
			}
			default: // Se não for nenhuma opcao entra aqui
				JOptionPane.showMessageDialog(null, "Insira 1 ou 2");
				break;
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
