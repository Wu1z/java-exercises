package aula3exercicio4;

public class Calculo {
	public static void somatorio(int numero) {
		int soma = 0;
		
		for(int i = 0; i <= numero; i++ ) { 
			soma += i;
			System.out.println("[" + (soma-i) + "] + ["+ i + "] = " + soma);
		}
	}
}
