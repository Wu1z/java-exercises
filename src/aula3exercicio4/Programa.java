/*
 * Implemente um programa em Java que calcule o somat�rio de um n�mero inteiro positivo recebido pelo usu�rio (efetue a valida��o para garantir esta premissa).
 * Um m�todo chamado somat�rio deve ser criado por voc�.
 * Como par�metro, ele deve receber um n�mero, e o retorno deve ser a soma de todos os n�meros anteriores at� o zero.
 * Por exemplo: se for passado 3 para o m�todo, deve retornar a soma de 0 + 1 + 2 + 3.
 */

package aula3exercicio4;

public class Programa {

	public static void main(String[] args) {
		int num;
		
		num = Leitura.lerInt("Informe um n�mero inteiro: ");
		Calculo.somatorio(num);
	}

}
