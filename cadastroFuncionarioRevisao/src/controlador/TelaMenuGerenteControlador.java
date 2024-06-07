package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tela.TelaCadastroGerente;

public class TelaMenuGerenteControlador implements ActionListener {

	//Atributo de Classe
	JTextField opcaoRecebida;
	JFrame frameTelaMenuGerente;
	
	// Telas
	TelaCadastroGerente cadastroGerente = new TelaCadastroGerente();

	

	public TelaMenuGerenteControlador(JTextField opcaoRecebida, JFrame frameTelaMenuGerente) {
		super();
		this.opcaoRecebida = opcaoRecebida;
		this.frameTelaMenuGerente = frameTelaMenuGerente;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(opcaoRecebida.getText().equals("G1") || opcaoRecebida.getText().equals("G2") ) {
			switch (opcaoRecebida.getText()) {
				case "G1": {
					cadastroGerente.chamarTelaCadastroGerente();
					System.out.println("Direcione para o cadastro de gerente");
					frameTelaMenuGerente.setVisible(false);
					break;
					
				}
				case "G2": {
					
					System.out.println("Direcione para a lista de gerente");
					break;
				}
				case "3": {
						System.exit(0);
						break;
						
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "A opcão " + opcaoRecebida.getText() +" Não é valida");
		}
	}
}
