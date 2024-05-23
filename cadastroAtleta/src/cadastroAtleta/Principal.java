package cadastroAtleta;

import java.util.Scanner;

import entidade.Atleta;
import entidade.JogadorFutebol;
import entidade.JogadorVolei;

public class Principal {

	//Inicio do metodo MAIN
	public static void main(String[] args) {
		
		Atleta objetoAtleta = new Atleta();// Cria o objeto vazio
		
		JogadorFutebol jogadorFutebol = new JogadorFutebol("Luciano Camisa 10",15, 50, 5000, 50);
		
		JogadorVolei jogadorVolei = new JogadorVolei("Henrique", 25, 30, 150,50);
		
		JogadorVolei jogadorVoleiSemSalario = new JogadorVolei("Henrique", 25, 30, 150);
		
		
		JogadorVolei jogadorVolei2 = new JogadorVolei();
		
	
		Scanner entradaDados = new Scanner(System.in);
		/*
		System.out.println("Infome o nome do Atleta");
		objetoAtleta.nome = entradaDados.next();
		
		System.out.println("Idade");
		objetoAtleta.idade = Integer.parseInt(entradaDados.next());// Converte String para inteiro
		
		System.out.println("Quantas Partidadas ele jogou");
		objetoAtleta.qtdPartida = Integer.parseInt(entradaDados.next());// Converte a String para double
		
		
		objetoAtleta.salario = calcularSalario(objetoAtleta.qtdPartida);
		
		imprimirResultadosNoConsole(objetoAtleta); // Chamo a execução do metodo para imprimir os resultados
		
		*/
		
		jogadorVoleiSemSalario.salario = 5000;
		
		jogadorVolei2.salario = 5000;
		
		System.out.println("O salario do jogador Construido sem salario é:" + jogadorVoleiSemSalario.salario);
		
		
		
	
	
	
	}//FIM DO METODO
	
	//Metodo pra imprimir resultado
	
	
	
	public static void imprimirResultadosNoConsole(Atleta atleta) {
		System.out.println("Nome do Atleta:" + atleta.nome);
		System.out.println("Idade do Atleta:" + atleta.idade);
		System.out.println("Salario do Atleta:" + atleta.salario);
		
			
	}
	
	public static Double calcularSalario(int qtdPartida) {
		
		double salario = qtdPartida * 10000;
		
		return salario;
	}
	
	

}
