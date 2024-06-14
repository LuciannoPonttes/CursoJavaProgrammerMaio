package controlador.atendente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import tela.atendente.TelaMenuAtendente;

public class TelaListarAtendenteControlador implements ActionListener {

	
	JFrame telaListar;
	
	public TelaListarAtendenteControlador(JFrame telaListar) {
	
		this.telaListar = telaListar;
	}


	TelaMenuAtendente telaMenuAtendente = new TelaMenuAtendente();
	

	@Override
	public void actionPerformed(ActionEvent e) {
		telaListar.setVisible(false);
		telaMenuAtendente.chamarTelaMenuAtendente();
		
	}

}
