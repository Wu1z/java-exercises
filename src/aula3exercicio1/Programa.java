/*
 * Implemente um programa em Java que calcule o juro de uma dívida que você contraiu no mês passado no crediário de uma loja.
 * A taxa de juros mensal e o valor da dívida serão fornecidos pelo usuário.
 * A dívida deve ser calculada por método criado por você chamado: calcularDivida e deve receber como parâmetro os valores necessários para o cálculo e retornar a referida dívida.
*/

package aula3exercicio1;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		double divida, juros, total;
		
		System.out.print("Informe a dívida : ");
		divida = new Scanner(System.in).nextDouble();
		
		System.out.print("Informe os juros: ");
		juros = new Scanner(System.in).nextDouble();
		
		total = calcularDivida(divida, juros);
		
		System.out.println("O valor total da divida com juros é : " + total);
	}
	
	public static double calcularDivida(double divida, double juros) {
		double calculo;
		calculo = (divida / 100) * juros;
		divida += calculo;
		
		return (divida);
	}

}
