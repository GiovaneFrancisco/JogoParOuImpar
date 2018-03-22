package br.om.jogo;

import java.util.Random;
import java.util.Scanner;

// AtualizaÃ§Ã£o pelo GitHub
public class ParOuImparEscolha {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random num = new Random();
		// Declaração das variáveis
		int jogador = 0, computador = 0;
		String escjog = "a", esccomp = "a";

		do {
			int i = 1;
			//Jogador escolhe Par/Impar
			System.out.println("Esolha:");
			System.out.println("[1] Par");
			System.out.println("[2] Impar");
			int jog = teclado.nextInt();
			switch (jog) {
			case 1:
				//Caso jogador escolha Par, computador escolhe Impar
				escjog = "Par";
				esccomp = "Impar";
				break;
			case 2:
				//Caso jogador escolha Impar, computador escolhe Par
				escjog = "Impar";
				esccomp = "Parr";
				break;
			default:
				System.out.println("Opcao Invalida");
				break;
			}
			//Jogador escolhe um numero
			System.out.print("Digite um numero: ");
			int escjo = teclado.nextInt();
			int esccom = num.nextInt(10);
			//Computador escolhe um numero entre 0 e 10
			int total = escjo + esccom;
			System.out.println();
			System.out.println("Rodada " + i);
			System.out.println("=============================");
			System.out.println("Jogador: " + escjog);
			System.out.println("Computador: " + esccomp);
			System.out.println("=============================");
			System.out.println(escjo + " + " + esccom + " = " + total);
			System.out.println("=============================");
			//Analise dos resultados
			if (total % 2 == 0) {
				if (escjog == "Par" && esccomp == "Impar") {
					System.out.println("Jogador ganhou a rodada!");
					jogador++;
				} else if (escjog == "Impar" && esccomp == "Par") {
					System.out.println("Computador ganhou a rodada!");
					computador++;
				} else {
					System.out.println("Empate");
				}
			} else if (total % 2 == 1) {
				if (escjog == "Par" && esccomp == "Impar") {
					System.out.println("Computador ganhou a rodada!");
					computador++;
				} else if (escjog == "Impar" && esccomp == "Par") {
					System.out.println("Jogador gahou a rodada!");
					jogador++;
				} else {
					System.out.println("Empate");
				}
			}
			//Mostra resultado
			System.out.println(jogador + " x " + computador);
			System.out.println("=============================");
			System.out.println();
			i++;
			//Quando um dos 2 chega em 3 pontos, o programa acaba e informa quem ganhou o jogo
			if (jogador == 3) {
				System.out.println("Jogador ganhou o jogo!");
			} else if (computador == 3) {
				System.out.println("Computador ganhou o jogo!");
			}

		} while (jogador < 4 || computador < 4);
	}
}
