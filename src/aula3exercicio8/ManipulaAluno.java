package aula3exercicio8;

public class ManipulaAluno {
	public static Aluno lerAluno() {
		Aluno a = new Aluno();
		a.nome = Leitura.lerString("Informe o nome do aluno: ");
		a.nota1 = Leitura.lerInt("Informe a nota 01: ");
		a.nota2 = Leitura.lerInt("Informe a nota 02: ");
		
		a.media = media(a.nota1, a.nota2);
		
		return a;
	} 
	
	public static void isApproved(int media) {
		System.out.println("Média: " + media);
		if(media >= 6) {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO!");
		}
	}
	
	public static int media(int nota1, int nota2) {
		int media = (nota1 + nota2) / 2;
		return media;
	}
}
