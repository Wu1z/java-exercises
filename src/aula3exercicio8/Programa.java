/*
 * Crie uma entidade aluno, com nome e duas notas.
 * Receba do usu�rio os dados deste aluno e, na sequ�ncia, apresente todos os dados deste aluno.
 * Apresente tamb�m a m�dia dele e se est� aprovado ou reprovado.
 * Crie o maior n�mero de m�todos que conseguir visualizar.
*/
package aula3exercicio8;

public class Programa {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		a = ManipulaAluno.lerAluno();
		ManipulaAluno.isApproved(a.media);
	}

}
