/*
 * Uma escola deseja fazer um cadastro dos seus alunos.
 * Um aluno possui nome, matrícula e situação, que pode ser regular ou bolsista.
 * O usuário informará quantos alunos existem em uma turma. 
 * Você receberá os dados de todos os alunos e, na sequência, você deve apresentar todos os alunos informados, 
 * a quantidade de alunos regulares que existe e a quantidade de alunos bolsistas.
 */
package aula3exercicio9;

public class Programa {

	public static void main(String[] args) {
		int n;
		
		n = Leitura.lerInt("Informe o número de alunos: ");
		Aluno [] alunos = Manipula.criarAlunos(n);
		Manipula.print(alunos);
		Manipula.isBolsista(alunos);
	}
}
