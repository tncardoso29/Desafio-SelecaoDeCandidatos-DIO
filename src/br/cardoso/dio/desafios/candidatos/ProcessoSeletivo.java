package br.cardoso.dio.desafios.candidatos;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("..........: SISTEMA DE PROCESSOS SELETIVOS | v 1.0 :..........");
		System.out.println(); // Quebrando as linhas...
		
		imprimirSelecionados();
		
	}
	
	// Método para analise e seleção dos candidados;
		static void imprimirSelecionados() {
			String[] candidatos = {"MARQUINHOS", "BETTY", "MIKE", "FRANK"}; // Lista String de nome de candidatos;
			System.out.println(); // Quebrando as linhas...
			System.out.println("IMPRIMINDO A LISTA DE CANDIDATOS | INFORMANDO O INDICE DO ELEMENTO");
			
			
			// dsadsadsad
			for(int indice=0; indice < candidatos.length; indice++) {
				System.out.println("O CANDIDATO DE N° " + (indice+1) + " É: " + candidatos[indice]);
			}
			
			System.out.println(); // Quebrando as linhas...
			System.out.println("FORMA ABREVIADA DE INTERAÇÃO VIA 'FOR-EACH' ");
			System.out.println(); // Quebrando as linhas...
			
			for(String candidato: candidatos) {
				System.out.println("O CANDIDATO SELECIONADO FOI: " + candidato);
			}
		}
	
	// Método para analise e seleção dos candidados;
	static void selecaoDeCandidados() {
		String[] candidatos = {"MARQUINHOS", "BETTY", "MIKE", "FRANK", "PEACH", "MARCELA", "GUSTAVO"}; // Lista String de nome de candidatos;
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 3000.0;
		
		// Enquanto houver candidatos.. a lista de seleção correrá;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O CANDIDATO " + candidato + " SOLICITOU ESTE VALOR SALARIAL " + salarioPretendido);
			if(salarioBase >= salarioPretendido) { // dsdsadasd
				System.out.println("O CANDIDATO " + candidato + " FOI SELECIONADO!");
				candidatosSelecionados++;
			}
			else {
				// System.out.println("O CANDIDATO " + candidato + " NÃO FOI SELECIONADO!");
				candidatosAtual++;
			}
		}			
	}
	
	// Método para sugestão salarial na entrevista;
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(2800, 3200);
	}
	
	// Método para analise de sugestão de salário na entrevista 
	static void analisarCandidatos(double salarioPretendido) {
		double salarioBase = 3000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO.");
		}
		else if(salarioBase == salarioPretendido)
			System.out.println("LIGAR PARA OS DEMAIS CANDIDATOS.");
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!!");
		}
	}
}