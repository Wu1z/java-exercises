/*
 * Você deve implementar uma calculadora.
 * O usuário informará um valor, um operador e outro valor. 
 * Execute a operação e apresente o resultado. 
 * Faça uso do maior número de métodos que conseguir visualizar (na entrada de dados, nas operações). 
 * As operações disponíveis para esta calculadora são: adicionar, subtrair, dividir, multiplicar e expoente.  
 */

package aula3exercicio3;

public class Programa {

	public static void main(String[] args) {
		double valor1, valor2, resultado = 0;
		char operador;
		
		valor1 = Leitura.lerDouble("Informe o primeiro valor: ");
		operador = Leitura.lerChar("Informe o operador: ");
		valor2 = Leitura.lerDouble("Informe o segundo valor: ");
		
		resultado = Matematica.calcular(valor1, operador, valor2);
		System.out.printf("O resultado: %.2f", + resultado);
	}
}
