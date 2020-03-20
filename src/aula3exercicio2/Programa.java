/*
 * Implemente um programa em Java que receba a temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
 * A fórmula de conversão é: FAR = (9 * CEL + 160) / 5, sendo FAR a temperatura em Fahrenheit e CEL em Celsius.
 * Esta conversão deve ser feita por meio de um método com a seguinte assinatura: public static double fahrenheit(double celsius).
 * O método deve receber a temperatura em Celsius e retornar em Fahrenheit.
*/

package aula3exercicio2;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		double celsius, resultado;
		
		System.out.print("Informe a temperatuva em ºC : ");
		celsius = new Scanner(System.in).nextDouble();
		
		resultado = fahrenheit(celsius);
		System.out.printf("A temperatura %.1f ºC equivale a %.1f ºF", celsius, resultado);
	}
	
	public static double fahrenheit(double celsius) {
		double FAR;
		FAR = (9 * celsius + 160) / 5;
		
		return FAR;
	}
}
