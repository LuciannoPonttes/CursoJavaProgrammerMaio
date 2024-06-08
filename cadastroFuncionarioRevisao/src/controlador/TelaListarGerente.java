package controlador;

import java.time.chrono.JapaneseChronology;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import entidade.Gerente;

public class TelaListarGerente {
	
	public void listarGerente(List<Gerente> listaGerentes) {
		
		int quantidadeDeLinhas = listaGerentes.size();
		
		String[][] tabelaString = new String [quantidadeDeLinhas][3];
		
		int posicaoColuna = 0;
		int posicaoLinha = 0;
		
		for(Gerente gerente : listaGerentes) {
			
			tabelaString[posicaoLinha][posicaoColuna] = gerente.getCpf();
			posicaoColuna ++;
			
			tabelaString [posicaoLinha][posicaoColuna] = gerente.getNome();
			
			posicaoColuna ++;
			tabelaString [posicaoLinha][posicaoColuna] = gerente.getGerencia();
			
			posicaoLinha ++;
			posicaoColuna = 0;
			
			
		}
		
		String nomeColunas [] = {"CPF", "NOME", "GERENCIA"};
		
		
		JFrame frameListarGerentes = new JFrame();
		
		frameListarGerentes.setSize(500,600);
		
		JTable tabelaGerentes = new JTable(tabelaString, nomeColunas);
		
		tabelaGerentes.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneListarGerente = new JScrollPane(tabelaGerentes);
		
		JPanel panelListarGerente = new JPanel();
		
		panelListarGerente.add(scrollPaneListarGerente);
		
		frameListarGerentes.add(panelListarGerente);
		frameListarGerentes.setVisible(true);
		
	}

}
