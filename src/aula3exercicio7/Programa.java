/*
 *  Fa�a um programa que receba 5 mil dados do usu�rio do tipo inteiro.
 *  Sabe-se que valores negativos n�o s�o aceitos.
 *  Ap�s receber esses valores e popular o array, imprima na sa�da padr�o: 
 *  a m�dia dos valores, quantos valores s�o �mpares e todos os valores que foram informados. 
 *  Para esta solu��o, utilize o maior n�mero de m�todos visualizados.
 */
package aula3exercicio7;

public class Programa {

	public static void main(String[] args) {
		int [] dados = new int [5];

		dados = Leitura.lerArrayInt(dados.length);
		Calculos.showResults(dados);
	}

}
