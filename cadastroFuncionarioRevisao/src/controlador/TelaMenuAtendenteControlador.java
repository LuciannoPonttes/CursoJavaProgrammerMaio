package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tela.TelaCadastroAtendente;

public class TelaMenuAtendenteControlador implements ActionListener {

	JTextField opcao;
	JFrame telaMenuAtendente;
	

	public TelaMenuAtendenteControlador(JTextField opcao, JFrame telaMenuAtendente) {
		this.opcao = opcao;
		this.telaMenuAtendente = telaMenuAtendente;
	}
	
	TelaCadastroAtendente telaCadastroAtendente = new TelaCadastroAtendente();


	@Override
	public void actionPerformed(ActionEvent e) {
		if(opcao.getText().equals("A1")) {
			switch (opcao.getText()) {
				case "A1": {
					telaCadastroAtendente.chamarTelaCadastroAtendente();
					telaMenuAtendente.setVisible(false);
				
				}
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Opção Invalido");
		}
		
		
		
	}

}
