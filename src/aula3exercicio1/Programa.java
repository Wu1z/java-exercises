/*
 * Implemente um programa em Java que calcule o juro de uma d�vida que voc� contraiu no m�s passado no credi�rio de uma loja.
 * A taxa de juros mensal e o valor da d�vida ser�o fornecidos pelo usu�rio.
 * A d�vida deve ser calculada por m�todo criado por voc� chamado: calcularDivida e deve receber como par�metro os valores necess�rios para o c�lculo e retornar a referida d�vida.
*/

package aula3exercicio1;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		double divida, juros, total;
		
		System.out.print("Informe a d�vida : ");
		divida = new Scanner(System.in).nextDouble();
		
		System.out.print("Informe os juros: ");
		juros = new Scanner(System.in).nextDouble();
		
		total = calcularDivida(divida, juros);
		
		System.out.println("O valor total da divida com juros � : " + total);
	}
	
	public static double calcularDivida(double divida, double juros) {
		double calculo;
		calculo = (divida / 100) * juros;
		divida += calculo;
		
		return (divida);
	}

}
