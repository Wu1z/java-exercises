/*

Escreva um programa Java que leia 500 valores inteiros e positivos e:

    Encontre o maior valor.
    Encontre o menor valor.
    Calcule a m�dia dos n�meros lidos.

Fa�a as apresenta��es para o usu�rio de forma organizada.

*/

package aula2exercicio5;
import java.util.Scanner;

public class Programa {
	public static void main(String arg[]) {
		int [] num = new int[5];
		int maior = 0 , menor = 0, soma = 0, cont = 0;
		double media = 0;
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Informe um n�mero inteiro maior que zero[0] : ");
			num[i] = new Scanner(System.in).nextInt();
			
			while(num[i] < 0) {
				System.out.println("N�mero negativo! Informe apenas n�meros positivos.");
				System.out.print("Tente novamente: ");
				num[i] = new Scanner(System.in).nextInt();
			}
			
			if(i == 0) {
				maior = num[i];
				menor = num[i];
			}
			if(num[i] > maior) {
				maior = num[i];
			} else if(num[i] < menor){
				menor = num[i];
			}
			
			soma += num[i];
			cont++;
		}
		media = soma / cont;
		
		System.out.println("==================================");
		System.out.println("O maior valor: " + maior);
		System.out.println("O menor valor: " + menor);
		System.out.println("A media de todos os numeros: " + media);
	}
}
