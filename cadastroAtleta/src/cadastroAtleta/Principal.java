package cadastroAtleta;

import java.util.Scanner;

import entidade.Atleta;
import entidade.JogadorFutebol;
import entidade.JogadorVolei;

public class Principal { // O que uma classe? Representa um objeto concreto ou abstrato(veremos) dentro do projeto.
	//Ações(metodos) e atributos(caracteristiva - variaveis)

	//Inicio do metodo MAIN
	public static void main(String[] args) {
		
	JogadorFutebol jogadorFutebol = new JogadorFutebol("Luciano");
	
	JogadorVolei jogadorVolei = new JogadorVolei("Luciano");
	
	System.out.println(jogadorFutebol.getNome());
	System.out.println(jogadorVolei.getNome());
	
	
		
		
		
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void imprimirResultadosNoConsole(Atleta atleta) { // Metodo é um trecho resposavel por executar alguma ação
		
	//	System.out.println("Nome do Atleta:" + atleta.nome);
	//	System.out.println("Idade do Atleta:" + atleta.idade);
		//System.out.println("Salario do Atleta:" + atleta.salario);
		
			
	}
	
	public static Double calcularSalario(int qtdPartida) {
		
		double salario = qtdPartida * 10000;
		
		return salario;
	}
	
	

}
