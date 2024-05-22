import java.util.Scanner; // Objeto java Padrão para receber dados atraves do console.

public class Principal{ // Criação e nome da classe
	
	public static void main(String[] args){

		Scanner entradaDeDados = new Scanner (System.in); // Objeto java Padrão para receber dados atraves do console.
	
		
		//Cadastro do jogador de futebol

		JogadorFutebol objetoJogadorFutebol = new JogadorFutebol(); // Crio o objeto jogador de Futebol para que seja manipular 

		System.out.println("Digite o nome do Jogador de Futebol:");  
		
		objetoJogadorFutebol.nomeAtleta = entradaDeDados.next(); 

		System.out.println("Digite a idade do Jogador de Futebol:");  
		objetoJogadorFutebol.idade = Integer.parseInt(entradaDeDados.next());

		System.out.println("Digite a perna mais forte do jogador:");  
		objetoJogadorFutebol.pernaMaisForte = (entradaDeDados.next());// Esse atributo apenas o jogador de futebol tem

		 imprimir(objetoJogadorFutebol); // Chama o metodo para imprimir jogador

		//Jogador de Volei
		
		JogadorVolei objetoJogadorVolei = new JogadorVolei();

		System.out.println("Digite o nome do Jogador de Volei:");  
		
		objetoJogadorVolei.nomeAtleta = entradaDeDados.next(); 

		System.out.println("Digite a idade do Jogador de Volei:");  
		objetoJogadorVolei.idade = Integer.parseInt(entradaDeDados.next());

		System.out.println("Digite o braco mais forte do jogador de Volei:");  
		objetoJogadorVolei.bracoMaisForte = (entradaDeDados.next());// Esse atributo apenas o jogador de volei tem

		System.out.println("O nome do Jogador de Volei :" + objetoJogadorVolei.nomeAtleta );

		System.out.println("A idade do Jogador de Volei:" + objetoJogadorVolei.idade );
		
		System.out.println("Braco mais forte :" + objetoJogadorVolei.bracoMaisForte );
		
	}	
	
	//Metodo Que como como ação imprimir os dados do jogador
	public static void imprimir(JogadorFutebol objetoJogadorFutebol){

		System.out.println("O nome do Jogador de Futebol :" + objetoJogadorFutebol.nomeAtleta );

		System.out.println("A idade do Jogador de Futebol :" + objetoJogadorFutebol.idade );
		
		System.out.println("Perna mais forte :" + objetoJogadorFutebol.pernaMaisForte );

	}
	
	

	
}