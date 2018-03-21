package br.om.jogo;

import java.util.Random;
import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random num = new Random();
		int numerojog, numerocomp, jogador = 0, computador = 0;
		String jog, comp;
		for (int cont = 1; cont < 500; cont++) {
			System.out.print("Digite um número: ");
			numerojog = teclado.nextInt();
			numerocomp = (1 + (num.nextInt(20)));
			System.out.println("Rodada " + cont);
			System.out.println();
			System.out.println(numerojog + " + " + numerocomp + " = " + (numerojog + numerocomp));
			if (numerojog % 2 == 0) {
				jog = "Par";
			} else {
				jog = "Ímpar";
			}

			if (numerocomp % 2 == 0) {
				comp = "Par";
			} else {
				comp = "Ímpar";
			}
			System.out.println(jog + " X " + comp);

			if ((numerojog + numerocomp) % 2 == 0) {
				if (jog == "Par" && comp == "Par") {
					System.out.println("Empatou!");
				} else if (jog == "Par" && comp == "Ímpar") {
					System.out.println("Jogador ganhou a partida!");
					jogador++;
				} else if (jog == "Ímpar" && comp == "Par") {
					System.out.println("Computador ganhou a partida!");
					computador++;
				}
			} else if ((numerojog + numerocomp) % 2 == 1) {
				if (jog == "Ímpar" && comp == "Ímpar") {
					System.out.println("Empatou!");
				} else if (jog == "Par" && comp == "Ímpar") {
					System.out.println("Computador ganhou a partida!");
					computador++;
				} else if (jog == "Ímpar" && comp == "Par") {
					System.out.println("jogador ganhou a partida!");
					jogador++;
				}
			}
			System.out.println(jogador + " x " + computador);
			System.out.println();
			if (jogador == 5) {
				System.out.println("Jogador ganhou o jogo!");
				System.exit(0);
			} else if (computador == 5) {
				System.out.println("Computador ganhou o jogo!");
				System.exit(0);
			}
		}
	}
}
