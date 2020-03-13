/* 
 * Implemente um programa em Java que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês.
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, o programa deve mostrar como resultado o seu nome e o seu salário no final do mês.
*/

package aula2exercicio3;
import java.util.Scanner;

public class Programa {
	public static void main(String args[]) {
		double salario, valorVendas, soma, salarioTotal;
		double comissao = 0.15;
		
		System.out.print("Salário: ");
		salario = new Scanner(System.in).nextDouble();
		
		System.out.print("Valor em vendas: ");
		valorVendas = new Scanner(System.in).nextDouble();
		
		soma = valorVendas * comissao;
		salarioTotal = salario + soma;
		
		System.out.println("Salario Total: " + salarioTotal);
	}
}
