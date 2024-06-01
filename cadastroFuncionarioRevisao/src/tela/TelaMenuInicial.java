package tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaMenuInicial {
	
	
	public void chamarTelaMenuIniciar() {
		
		JFrame frameTelaInicial = new JFrame();// Instanciando um JFrame Vazio
		
		frameTelaInicial.setSize(200 , 200); // Altura e largura
		JPanel panelTelaInicial = new JPanel();// Cria o objeto painel
		
		JLabel labelOpcaoGerente = new JLabel(" 1 - MENU GERENTE");//Cria a label 1
		panelTelaInicial.add(labelOpcaoGerente);// Adiciona a label 1 no painel
		
		JLabel labelOpcaoAtendente = new JLabel(" 2 - MENU ATENDENTE");//Cria a label 1
		panelTelaInicial.add(labelOpcaoAtendente);// Adiciona a label 1 no painel
		panelTelaInicial.add(labelOpcaoAtendente);
		
		JTextField opcaoTexto = new JTextField(10);
		
		
		panelTelaInicial.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		panelTelaInicial.add(botaoEnviar);
		
		
		

		frameTelaInicial.add(panelTelaInicial);//Adiciona o painel no frame
		frameTelaInicial.setVisible(true);//Deixa visivel
		
		
		
	}

}
