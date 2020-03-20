package aula3exercicio6;

public class Calculo {
	public static double somar(int n) { 	// S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
		double s = 1;
		
		for(int i = 1; i <= n; i++) {
			s += (1 / i);
		}
		return s;
	}
}

