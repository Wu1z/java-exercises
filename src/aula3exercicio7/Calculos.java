package aula3exercicio7;

public class Calculos {
	// Mostra os resultados
	public static void showResults(int [] dados) {
		int media = media(dados);
		int impares = isImpar(dados);
		
		Leitura.print("=================");
		Leitura.print("Media: " + media);
		Leitura.print("=================");
		Leitura.print("Impar: " + impares);
	}
	
	// Verifica se o numero é impar
	public static int isImpar(int [] dados) {
		int impar = 0;
		
		for(int i = 0; i < dados.length; i++) {
			if(dados[i] % 2 != 0) {
				impar++;
			}
		} return impar;
	}
	
	// Soma os valores do array
	public static int media(int [] dados) {
		int soma = 0, media = 0;
		
		for(int i = 0; i < dados.length; i++) {
			soma += dados[i];
		} 
		media = soma / dados.length;
		return media;
	}
	
	// Se o numero é negativo solicita que informe novamente
	public static int isNegative(int dados) {
		int positiveNumber = dados;
		
		while(positiveNumber < 0) {
			System.out.println("Informe apenas números positivos;");
			positiveNumber = Leitura.lerInt("Informe novamente: ");
		} return positiveNumber;
	}
	
	// Verifica se o numero é positivo
	public static boolean checkPositiveNumber(int dados) {
		if(dados < 0) {
			return false;
		} else {
			return true;
		}
	}
}
