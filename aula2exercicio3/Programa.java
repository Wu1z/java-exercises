/* 
 * Implemente um programa em Java que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s.
 * Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, o programa deve mostrar como resultado o seu nome e o seu sal�rio no final do m�s.
*/

package aula2exercicio3;
import java.util.Scanner;

public class Programa {
	public static void main(String args[]) {
		double salario, valorVendas, soma, salarioTotal;
		double comissao = 0.15;
		
		System.out.print("Sal�rio: ");
		salario = new Scanner(System.in).nextDouble();
		
		System.out.print("Valor em vendas: ");
		valorVendas = new Scanner(System.in).nextDouble();
		
		soma = valorVendas * comissao;
		salarioTotal = salario + soma;
		
		System.out.println("Salario Total: " + salarioTotal);
	}
}
