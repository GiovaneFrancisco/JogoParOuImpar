package br.om.jogo;

import java.util.Random;
import java.util.Scanner;
 // Atualização pelo GitHub
public class ParOuImparEscolha {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random num = new Random();
		int jogador=0, computador =0;
		String escjog = "a", esccomp = "a";
		do {
			int i =1;
		System.out.println("Esolha:");
		System.out.println("[1] Par");
		System.out.println("[2] Ímpar");
		int jog = teclado.nextInt();
		switch (jog) {
		case 1:
			escjog = "Par";
			esccomp = "Ímpar";
			break;
		case 2:
			escjog = "Par";
			esccomp = "Ímpar";
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		System.out.print("Digite um número: ");
		int escjo = teclado.nextInt();
		int esccom = num.nextInt(10);
		int total = escjo + esccom ;
		System.out.println();
		System.out.println("Rodada " + i);
		System.out.println("=============================");
		System.out.println("Jogador: " + escjog);
		System.out.println("Computador: " + esccomp);
		System.out.println("=============================");
		System.out.println(escjo + " + " + esccom + " = " + total);
		System.out.println("=============================");
		if(total%2==0) {
			if(escjog=="Par" && esccomp=="Ímpar") {
				System.out.println("Jogador ganhou a rodada!");
				jogador++;
			}else if(escjog=="Ímpar" && esccomp=="Par") {
				System.out.println("Computador ganhou a rodada!");
				computador++;
			}else {
				System.out.println("Empate");
			}
		}else if(total%2==1) {
			if(escjog=="Par" && esccomp=="Ímpar") {
				System.out.println("Computador ganhou a rodada!");
				computador++;
			}else if(escjog=="Ímpar" && esccomp=="Par") {
				System.out.println("Jogador gahou a rodada!");
				jogador++;
			}else {
				System.out.println("Empate");
			}
		}
		System.out.println(jogador + " x " + computador);
		System.out.println("=============================");
		System.out.println();
		i++;
		if(jogador==3) {
			System.out.println("Jogador ganhou o jogo!");
			System.exit(0);
		}else if(computador == 3) {
			System.out.println("Computador ganhou o jogo!");
			System.exit(0);
		}
			
		}while(jogador<4);
	}
}

		
		

