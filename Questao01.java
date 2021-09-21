package Prova01;/* QUESTÃO 1 [ /15]
Faça um projeto em Java que leia as notas referente a uma prova de uma classe que contem 25 alunos.
As notas deverão ser lidas e salvas em um array.
Depois de lido, chame um metodo para achar e retornar qual a menor nota.
Em seguida, faça o mesmo para a maior nota.
No final imprima a menor e a maior nota da prova.  */

import java.util.Scanner;
public class Questao01 {
	
	public static void main(String[]args) {
		
		
		Scanner entrada = new Scanner(System.in);
	
		
		
		int [] notas = new int [25];
		
		for(int i = 0; i <25 ; i++) {
		System.out.println("Informe a nota");
		notas[i] = entrada.nextInt();
		
		}
		int maior = maiorNota(notas);
		int menor =menorNota(notas);
		
		System.out.println("A maior nota foi "+maior+ "\n   a menor foi\n"+menor);
		
	}
	
	
		
		public static int maiorNota (int [] notas) {
			int maiorNota = 0;
			for(int i=0;i<25;i++) {
			if(notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
					
			
		}
			
			return maiorNota;
			

}
		
		public static int menorNota (int [] notas ) {
			int menorNota = 0;
			
			for(int i =0 ; i<25;i++) {
				if(notas[i] < menorNota) {
					
					menorNota = notas[i];
					
				}
				
			}
			
			return menorNota;
		}
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}	
