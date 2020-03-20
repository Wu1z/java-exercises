/*
 * Uma escola deseja fazer um cadastro dos seus alunos.
 * Um aluno possui nome, matr�cula e situa��o, que pode ser regular ou bolsista.
 * O usu�rio informar� quantos alunos existem em uma turma. 
 * Voc� receber� os dados de todos os alunos e, na sequ�ncia, voc� deve apresentar todos os alunos informados, 
 * a quantidade de alunos regulares que existe e a quantidade de alunos bolsistas.
 */
package aula3exercicio9;

public class Programa {

	public static void main(String[] args) {
		int n;
		
		n = Leitura.lerInt("Informe o n�mero de alunos: ");
		Aluno [] alunos = Manipula.criarAlunos(n);
		Manipula.print(alunos);
		Manipula.isBolsista(alunos);
	}
}
