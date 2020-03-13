/*
 *  Fa�a um programa Java que receba o nome de um estudante e duas notas.
 *  Na sequ�ncia, apresente todos os valores informados, a m�dia, e se ele est� aprovado ou reprovado.
 *  Detalhe: voc� n�o deve permitir que os valores informados como notas sejam inferiores a 0 ou superiores a 10
 *  O usu�rio deve informar se quer continuar a usar o programa informando S-Sim ou N-N�o.
*/

package aula2exercicio7;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		double [] notas = new double[2];
		double media, soma;
		char option = 'n';
		
		 do {
			media = 0;
			soma = 0;
			
			for(int i = 0; i < notas.length; i++) {	
				do {
					System.out.printf("Informe a nota 0%d : ", i + 1);
					notas[i] = new Scanner(System.in).nextDouble();
				} while(notas[i] < 0 && notas[i] > 10);	
				
				soma += notas[i];
			}
			
			media = soma / notas.length;
			
			for(int i = 0; i < notas.length; i++) {
				System.out.printf("Nota 0%d: %.2f \n",  i + 1, notas[i]);
			}
			
			System.out.println("A m�dia: " + media);
			if(media > 6) {
				System.out.println("APROVADO!");
			} else {
				System.out.println("REPROVADO!");
			}
			
			System.out.print("Deseja continuar utilizando o sistema? ");
			option = new Scanner(System.in).next().charAt(0);
			
		 } while(option == 's' || option == 'S');
	}
}
