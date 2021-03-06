package br.univel;

import java.util.Scanner;

public class ArvoreControle {
	
	private static ArvoreBinaria arvoreBinaria;
	
	private void menu() {
	
		int opcao;
		
		Scanner entradaUsuario	= new Scanner(System.in);
		
		System.out.println("\nMENU DE OP��ES\n") ;
		System.out.println("1 - Inserir n�") ;
		System.out.println("2 - Percorrer Pr�-ordem") ;
		System.out.println("5 - Exibir Arvore") ;
		System.out.println("6 - Limpar Arvore") ;
		System.out.println("9 - Sair") ;
		System.out.print("Digite sua op��o:") ;
		opcao = entradaUsuario.nextInt() ;
		
		switch(opcao){
		
			case 1:
				Scanner vlr	= new Scanner(System.in);
				
				System.out.println("\nINFORME UM VALOR INTEIRO") ;
				opcao = entradaUsuario.nextInt() ;
				
				arvoreBinaria.insereNo(opcao);
				this.menu();
				
				break;
				
			case 2:
				System.out.println("\n\n");
				arvoreBinaria.percorrerPreOrdem();
				System.out.println("\n\n");
				this.menu();
				break;				
							
			case 6:
				this.menu();
				break;	
				
			case 9:
				System.exit(0);
				
			default:
				System.out.println("\nOP��O INVALIDA, TENTE NOVAMENTE...\n");
				menu();
				break;
		
		}		
	}	
	
	public static void main(String[] args){
		arvoreBinaria = new ArvoreBinaria();
		ArvoreControle controle = new ArvoreControle();
		controle.menu();
	}
	
}