package Prova01;
/*Faça um projeto em Java que leia uma lista de 50 convidados para uma festa.
Sua missão é ler os nomes e salva-los em um array.
Caso o nome digitado já esteja na lista, você deverá dar uma mensagem informando que essa pessoa já
está na lista e não deverá salva-la novamente!
OBS: utilize sempre métodos!!! Não “polua” o método main!  */


import java.util.Scanner;
public class Questão02 {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String [] nome = new String[50];
		int i ;
		
		for( i =0; i<50;i++) {
			System.out.println("Digite um nome ");
			nome[i] = entrada.nextLine();
			 		
		
			if(nome[i] .equals(nome[i])) {
				System.out.println("Nome repetido informe outro");
				
				
			}else {
				nome[i] += nome[i];
			}
		}
		}
	}


