/*
 * Você deve fazer a implementação de uma classe chamada MyMath.java, que deverá ter quatro métodos conforme a listagem a seguir:
 * Receber um número inteiro como argumento e calcular o fatorial.
 * Receber dois valores como argumento e retornar o número que for maior.
 * Receber um valor inteiro como argumento e retornar se ele é um número par. (retorne true ou false)
 * Receber um número inteiro e retornar se ele é um número primo matemático (desafio).
 */

package aula3exercicio5;

public class Programa {

	public static void main(String[] args) {
		int numero, fatorial, n1, n2, maior, par, primo;
		boolean isPar;
		
		Leitura.print("FATORIAL");
		Leitura.print("============================================");
		
			numero = Leitura.lerInt("Informe um numero inteiro: ");
			fatorial = MyMath.fatorial(numero);
			Leitura.print("Fatorial de [" + numero + "] é: " + fatorial);
			Leitura.print("");
			
		Leitura.print("MAIOR NÚMERO");
		Leitura.print("============================================");
		
			n1 = Leitura.lerInt("Numero 1: ");
			n2 = Leitura.lerInt("Numero 2: ");
			maior = MyMath.maior(n1, n2);
			Leitura.print("Maior número: " + maior);
			Leitura.print("");
			
		Leitura.print("NÚMERO PAR");
		Leitura.print("============================================");
		
			par = Leitura.lerInt("Informe um número PAR: ");
			isPar = MyMath.isPar(par);
			
			if(isPar == true) {
				Leitura.print("[" + par + "] é PAR" );
			} else {
				Leitura.print("[" + par + "] é ÍMPAR" );
			}
			Leitura.print("");
			
		Leitura.print("NÚMERO PRIMO");
		Leitura.print("============================================");
		
			primo = Leitura.lerInt("Informe um número primo: ");
			MyMath.isPrimo(primo);
			
	}
}
