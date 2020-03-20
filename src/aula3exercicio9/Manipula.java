package aula3exercicio9;

public class Manipula {

	public static Aluno lerAluno() {
		Aluno a = new Aluno();
		
		a.nome = Leitura.lerString("Informe o nome do aluno: ");
		a.matricula = Leitura.lerInt("Informe a matrícula do(a) [" + a.nome + "] : ");
		a.situacao = Leitura.lerChar("Informe a situação do(a) [" + a.nome + "] : ");
		System.out.println("=============================");
		return a;
	}
	
	public static Aluno[] criarAlunos(int n) {
		Aluno [] alunos = new Aluno[n];
		
		for(int i = 0; i < alunos.length; i++) {
			alunos[i] = lerAluno();
		} return alunos;
	}
	
	public static void isBolsista(Aluno[] alunos) {
		int cont = 0;
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i].situacao == 'b') {
				cont++;
			}
		}
		
		System.out.println("Total de " + cont + " alunos bolsistas.");
	}
	
	public static void print(Aluno aluno) {
		System.out.println("Nome: " + aluno.nome);
		System.out.println("Matricula: " + aluno.matricula);
		System.out.println("Situação: " + aluno.situacao);
		System.out.println("");
	}
	
	public static void print(Aluno[] alunos) {
		for(int i = 0; i < alunos.length; i++) {
			print(alunos[i]);
		}
	}
}
