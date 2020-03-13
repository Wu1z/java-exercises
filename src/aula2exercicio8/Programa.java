/*
 *  Faça um programa que receba 5 mil dados do usuário do tipo inteiro.
 *  Sabe-se que valores negativos não são aceitos.
 *  Após receber esses valores e popular o array, imprima na saída padrão a média dos valores, quantos valores são ímpares e todos os valores que foram informados.
*/

package aula2exercicio8;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		int [] numbers = new int[5];
		int impar = 0, soma = 0;
		double media = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Informe um valor inteiro: ");
			numbers[i] = new Scanner(System.in).nextInt();
			
			while(numbers[i] < 0) {
				System.out.println("NÚMERO INCORRETO! Apenas números positivos;");
				System.out.print("Informe novamente: ");
				numbers[i] = new Scanner(System.in).nextInt();
			}
			
			if(numbers[i] % 2 != 0) { impar++; } 
			
			soma += numbers[i];
		}
		
		media = soma / numbers.length;
		
		System.out.println("==================");
		System.out.println("RESULTADO: ");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("Número %d : %d\n", i + 1, numbers[i]);
		}
		
		System.out.println("==================");
		System.out.println("Media : " + media);
		System.out.println("Impares : " + impar);
	}
}
