/*
 * Implemente um programa em Java que receba a temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
 * A f�rmula de convers�o �: FAR = (9 * CEL + 160) / 5, sendo FAR a temperatura em Fahrenheit e CEL em Celsius.
 * Esta convers�o deve ser feita por meio de um m�todo com a seguinte assinatura: public static double fahrenheit(double celsius).
 * O m�todo deve receber a temperatura em Celsius e retornar em Fahrenheit.
*/

package aula3exercicio2;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		double celsius, resultado;
		
		System.out.print("Informe a temperatuva em �C : ");
		celsius = new Scanner(System.in).nextDouble();
		
		resultado = fahrenheit(celsius);
		System.out.printf("A temperatura %.1f �C equivale a %.1f �F", celsius, resultado);
	}
	
	public static double fahrenheit(double celsius) {
		double FAR;
		FAR = (9 * celsius + 160) / 5;
		
		return FAR;
	}
}
