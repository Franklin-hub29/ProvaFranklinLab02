package Prova01;
/*Fa�a um projeto em Java que leia uma lista de 50 convidados para uma festa.
Sua miss�o � ler os nomes e salva-los em um array.
Caso o nome digitado j� esteja na lista, voc� dever� dar uma mensagem informando que essa pessoa j�
est� na lista e n�o dever� salva-la novamente!
OBS: utilize sempre m�todos!!! N�o �polua� o m�todo main!  */


import java.util.Scanner;
public class Quest�o02 {
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


