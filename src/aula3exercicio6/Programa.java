/*
 * Escreva um programa Java que lê um valor n inteiro e positivo e que calcule a seguinte soma por meio de um método chamado somar
 * S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
*/

package aula3exercicio6;

public class Programa {

	public static void main(String[] args) {
		int num; 
		double resultado;
		
		num = Leitura.lerInt("Informe um número inteiro: ");
		resultado = Calculo.somar(num);
		
		Leitura.print("O resultado: " + resultado);
	}

}
