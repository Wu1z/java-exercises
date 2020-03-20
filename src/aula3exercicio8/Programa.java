/*
 * Crie uma entidade aluno, com nome e duas notas.
 * Receba do usuário os dados deste aluno e, na sequência, apresente todos os dados deste aluno.
 * Apresente também a média dele e se está aprovado ou reprovado.
 * Crie o maior número de métodos que conseguir visualizar.
*/
package aula3exercicio8;

public class Programa {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		a = ManipulaAluno.lerAluno();
		ManipulaAluno.isApproved(a.media);
	}

}
