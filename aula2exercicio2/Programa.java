/*
 * Implemente um programa em Java que calcule o juro de uma d�vida que voc� contraiu no m�s passado no credi�rio de uma loja. 
 * A taxa de juros mensal e o valor da d�vida ser�o fornecidos pelo usu�rio.
*/

package aula2exercicio2;
import java.util.Scanner;

public class Programa {
	public static void main(String arg[]) {
		double divida, taxaJuros, soma, valorTotal;
		
		System.out.print("Divida: ");
		divida = new Scanner(System.in).nextDouble();
		
		System.out.print("Taxa de Juros: %");
		taxaJuros = new Scanner(System.in).nextDouble();
		
		soma = (divida / 100) * taxaJuros;
		valorTotal = divida + soma;
		
		System.out.println("O valor total da d�vida com juros: R$ " + valorTotal);
	}
}
