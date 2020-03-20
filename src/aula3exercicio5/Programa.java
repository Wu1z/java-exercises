/*
 * Voc� deve fazer a implementa��o de uma classe chamada MyMath.java, que dever� ter quatro m�todos conforme a listagem a seguir:
 * Receber um n�mero inteiro como argumento e calcular o fatorial.
 * Receber dois valores como argumento e retornar o n�mero que for maior.
 * Receber um valor inteiro como argumento e retornar se ele � um n�mero par. (retorne true ou false)
 * Receber um n�mero inteiro e retornar se ele � um n�mero primo matem�tico (desafio).
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
			Leitura.print("Fatorial de [" + numero + "] �: " + fatorial);
			Leitura.print("");
			
		Leitura.print("MAIOR N�MERO");
		Leitura.print("============================================");
		
			n1 = Leitura.lerInt("Numero 1: ");
			n2 = Leitura.lerInt("Numero 2: ");
			maior = MyMath.maior(n1, n2);
			Leitura.print("Maior n�mero: " + maior);
			Leitura.print("");
			
		Leitura.print("N�MERO PAR");
		Leitura.print("============================================");
		
			par = Leitura.lerInt("Informe um n�mero PAR: ");
			isPar = MyMath.isPar(par);
			
			if(isPar == true) {
				Leitura.print("[" + par + "] � PAR" );
			} else {
				Leitura.print("[" + par + "] � �MPAR" );
			}
			Leitura.print("");
			
		Leitura.print("N�MERO PRIMO");
		Leitura.print("============================================");
		
			primo = Leitura.lerInt("Informe um n�mero primo: ");
			MyMath.isPrimo(primo);
			
	}
}
