package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import persistencia.DaoGerente;
import repositorio.GerenteRepositorio;
import repositorio.GerenteRepositorioImplemetacao;
import tela.TelaCadastroGerente;
import tela.TelaDeletarGerente;
import tela.TelaListarGerente;


public class TelaMenuGerenteControlador implements ActionListener {

	//Atributo de Classe
	JTextField opcaoRecebida;
	JFrame frameTelaMenuGerente;
	
	// Telas
	TelaCadastroGerente cadastroGerente = new TelaCadastroGerente();
	TelaListarGerente telaListarGerente = new TelaListarGerente();
	TelaDeletarGerente telaDeletarGerente = new TelaDeletarGerente();

	GerenteRepositorioImplemetacao gerenteRepositorio = new GerenteRepositorioImplemetacao();

	

	public TelaMenuGerenteControlador(JTextField opcaoRecebida, JFrame frameTelaMenuGerente) {
		
		this.opcaoRecebida = opcaoRecebida;
		this.frameTelaMenuGerente = frameTelaMenuGerente;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(opcaoRecebida.getText().equals("G1") || opcaoRecebida.getText().equals("G2") || opcaoRecebida.getText().equals("G3")  ) {
			switch (opcaoRecebida.getText()) {
				case "G1": {
					cadastroGerente.chamarTelaCadastroGerente();
					System.out.println("Direcione para o cadastro de gerente");
					frameTelaMenuGerente.setVisible(false);
					break;
				}
				case "G2": {
					telaListarGerente.listarGerente(gerenteRepositorio.listarGerenteRepositorio());
					System.out.println("Direcione para a lista de gerente");
					break;
				}
				case "G3": {
					telaDeletarGerente.chamardTelaeletarGerente(gerenteRepositorio.listarGerenteRepositorio());
					System.out.println("Direcione para deletar de gerente");
					break;
				}
				case "SAIR": {
						System.exit(0);
						break;
						
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "A opcão " + opcaoRecebida.getText() +" Não é valida");
		}
	}
}
