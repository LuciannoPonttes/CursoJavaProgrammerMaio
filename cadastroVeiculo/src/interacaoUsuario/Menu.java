package interacaoUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidade.Carro;
import entidade.Moto;

public class Menu {

	
	public void menuInicial() {
		
		
		CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();// Instancia a classe cadastro de veiculo
		
		Moto motoParaAddNaLista = new Moto();//Instancia a classe MOTO -> OBJETO DO TIPO ENTIDADE
		
		Carro carroParaAddNaLista = new Carro();//Instancia a classe do tipo carro -> OBJETO DO TIPO ENTIDADE
		
		List<Moto> motoLista = new ArrayList<Moto>();// Cria uma lista que armazena itens do tipo MOTO
		
		
		List<Carro> carroLista = new ArrayList<Carro>();//Cria uma lista que armazena objetos do tipo CARRO
		
		
		int opcao; // Armazena a opção de menu escolhida pelo usuariop
		
		// tudo que está dentro do while vai se repetir enquanto(while) a variavel menuResultado for true(verdadeiro)
		while (true) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para CARRO " + "\n"
					+ " Digite 2 para moto" + "\n" 
					+ " Digite 3 para listar as Motos" + "\n"
					+ " Digite 4 para listar as Motos" + "\n"
					+ " Digite 5 para listaEncerrar" + "\n"
					
					));
			
			switch (opcao) { // Verificar o valor da variavel opcao
			case 1: { // Caso for 1 entra nesse caso
				carroParaAddNaLista = cadastroVeiculo.cadastrarCarro();// Chama o metodo que é responsavel por cadastrar o carro
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
		
		
	}

}
