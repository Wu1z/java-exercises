package aula3exercicio7;
import java.util.Scanner;

@SuppressWarnings("all")
public class Leitura {
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	public static int[] lerArrayInt(int n) {
		int [] dados = new int [n];
		for(int i = 0; i < n; i++) {
			dados[i] = lerInt("Informe o valor [" + (i+1) +"] :");
			
			if(!Calculos.checkPositiveNumber(dados[i])) {
				dados[i] = Calculos.isNegative(dados[i]);
			}
		} return dados;
	}
	
	public static int lerInt(String msg) {
		System.out.println(msg);
		return lerInt();
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
}
