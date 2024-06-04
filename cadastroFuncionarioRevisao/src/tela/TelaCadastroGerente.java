package tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaCadastroGerenteControlador;

public class TelaCadastroGerente {
	
	public void chamarTelaCadastroGerente () {
		
		String primeiroCampo = "Digite o nome do Gerente";
		String segundoCampo  = "Digite o cpf do Gerente";
		String terceiroCampo = "Digite a gerencia do Gerente";
		
		JFrame frameTelaCadastroGerente = new JFrame();// Instanciando um JFrame Vazio
		
		frameTelaCadastroGerente.setSize(200 , 250); // Altura e largura
		JPanel panelTelaCadastroGerente = new JPanel();// Cria o objeto painel
		
		JLabel labelPrimeiroCampo = new JLabel(primeiroCampo);
		panelTelaCadastroGerente.add(labelPrimeiroCampo);
		
		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		panelTelaCadastroGerente.add(caixaTextoPrimeiroCampo);
		
		JLabel labelSegundoCampo = new JLabel(segundoCampo);
		panelTelaCadastroGerente.add(labelSegundoCampo);
		
		JTextField caixaTextoSegundoCampo = new JTextField(10);
		panelTelaCadastroGerente.add(caixaTextoSegundoCampo);
		
		
		JLabel labelTerceiroCampo = new JLabel(terceiroCampo);
		panelTelaCadastroGerente.add(labelTerceiroCampo);
		
		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		panelTelaCadastroGerente.add(caixaTextoTerceiroCampo);
		
		
		JButton botaoCadastrar = new JButton("Cadastrar Gerente");
		panelTelaCadastroGerente.add(botaoCadastrar);
		
		
		frameTelaCadastroGerente.add(panelTelaCadastroGerente);
		frameTelaCadastroGerente.setVisible(true);
		
		TelaCadastroGerenteControlador cadastroGerenteControlador = new  TelaCadastroGerenteControlador(
				caixaTextoPrimeiroCampo,caixaTextoSegundoCampo,caixaTextoTerceiroCampo);
		botaoCadastrar.addActionListener(cadastroGerenteControlador);
		
	}

}
