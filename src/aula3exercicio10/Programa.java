/*
 * Um piloto tem nome, escuderia e tempo de volta (em minutos apenas não pode ser menor que 1 nem maior que 60).
 * Faça um programa Java que receba os dados dos pilotos de uma corrida. Ao final mostre o seguinte: 
 * - O piloto mais rápido.
 * - O piloto mais lento.
 * - A média dos tempos.
 * DESAFIO: todos os pilotos ordenados pelo tempo. (Use o bubblesort)
 * 
 */
package aula3exercicio10;

public class Programa {

	public static void main(String[] args) {
		int quant = 0;
		quant = Leitura.lerInt("Nº de Pilotos:  ");
		
		Piloto [] pilotos = Dados.criarPilotos(quant);
		Dados.showResults(pilotos);
		
	}
}
