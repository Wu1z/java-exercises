/*
 * Um piloto tem nome, escuderia e tempo de volta (em minutos apenas n�o pode ser menor que 1 nem maior que 60).
 * Fa�a um programa Java que receba os dados dos pilotos de uma corrida. Ao final mostre o seguinte: 
 * - O piloto mais r�pido.
 * - O piloto mais lento.
 * - A m�dia dos tempos.
 * DESAFIO: todos os pilotos ordenados pelo tempo. (Use o bubblesort)
 * 
 */
package aula3exercicio10;

public class Programa {

	public static void main(String[] args) {
		int quant = 0;
		quant = Leitura.lerInt("N� de Pilotos:  ");
		
		Piloto [] pilotos = Dados.criarPilotos(quant);
		Dados.showResults(pilotos);
		
	}
}
