package tela;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaCadastroAtendenteControlador;

public class TelaCadastroAtendente {
	
public void chamarTelaCadastroAtendente () {
		
		
		GridLayout grid = new GridLayout (0,1);
		String primeiroCampo = "Digite o nome do Atendente";
		String segundoCampo  = "Digite o cpf do Atendente";
		String terceiroCampo = "Digite  setor do Atendente";
		
		JFrame frameTelaCadastroAtendente = new JFrame();// Instanciando um JFrame Vazio
		
		frameTelaCadastroAtendente.setSize(200 , 250); // Altura e largura
		JPanel panelTelaCadastroAtendente = new JPanel();// Cria o objeto painel
		
		JLabel labelPrimeiroCampo = new JLabel(primeiroCampo);
		panelTelaCadastroAtendente.add(labelPrimeiroCampo);
		
		panelTelaCadastroAtendente.setLayout(grid);
		
		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		panelTelaCadastroAtendente.add(caixaTextoPrimeiroCampo);
		
		JLabel labelSegundoCampo = new JLabel(segundoCampo);
		panelTelaCadastroAtendente.add(labelSegundoCampo);
		
		JTextField caixaTextoSegundoCampo = new JTextField(10);
		panelTelaCadastroAtendente.add(caixaTextoSegundoCampo);
		
		
		JLabel labelTerceiroCampo = new JLabel(terceiroCampo);
		panelTelaCadastroAtendente.add(labelTerceiroCampo);
		
		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		panelTelaCadastroAtendente.add(caixaTextoTerceiroCampo);
		
		
		JButton botaoCadastrar = new JButton("Cadastrar Atendente");
		panelTelaCadastroAtendente.add(botaoCadastrar);
		
		
		frameTelaCadastroAtendente.add(panelTelaCadastroAtendente);
		frameTelaCadastroAtendente.setVisible(true);
		
		TelaCadastroAtendenteControlador atendenteControlador = new TelaCadastroAtendenteControlador(caixaTextoPrimeiroCampo, caixaTextoSegundoCampo, caixaTextoTerceiroCampo, frameTelaCadastroAtendente);
		botaoCadastrar.addActionListener(atendenteControlador);
	}
}
