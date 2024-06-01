package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.swing.JTextField;

public class TelaMenuInicialControlador implements ActionListener {

	JTextField opcao;
	
	
	public TelaMenuInicialControlador(JTextField opcao) {
		this.opcao = opcao;
	}

	@Override//Vamos entrar no polimorfismo
	public void actionPerformed(ActionEvent e) {
		
		
			switch (opcao.getText()) {
				case "1": {
					System.out.println("Direcione para tela do gerente");
					break;
					
				}
				case "2": {
					
					System.out.println("Direcione para tela do atendente");
					break;
				}
				case "3": {
						System.exit(0);
						break;
						
				}
			
			}
		
	}

}
