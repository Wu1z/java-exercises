/*
 * Voc� deve implementar uma calculadora.
 * O usu�rio informar� um valor, um operador e outro valor. 
 * Execute a opera��o e apresente o resultado. 
 * Fa�a uso do maior n�mero de m�todos que conseguir visualizar (na entrada de dados, nas opera��es). 
 * As opera��es dispon�veis para esta calculadora s�o: adicionar, subtrair, dividir, multiplicar e expoente.  
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
