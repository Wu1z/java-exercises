/*
 * Escreva um programa em Java que leia a idade e a altura de 10 pessoas. 
 * Calcule e informe a média das alturas das pessoas com mais de 50 anos. Para isso, use for.
*/

package aula2exercicio4;
import java.util.Scanner;

public class Programa {
	public static void main(String args[]) {
		int [] idade = new int[10];
		int cont = 0;
		double [] altura = new double[10];
		double soma = 0, media = 0;
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println("CADASTRO N" + i);
			
			System.out.print("Informe sua altura: ");
			altura[i] = new Scanner(System.in).nextDouble();
			
			System.out.print("Informe a idade: ");
			idade[i] = new Scanner(System.in).nextInt();
			
			if(idade[i] >= 50) {
				soma += altura[i];
				cont++;
			} else {
				soma +=  0;
			}
		}
		media = soma / cont;
		System.out.println("Media das alturas das pessoas maiores de 50 anos: " + media);
	}
}
