package aula3exercicio3;

public class Matematica {
	
	public static double soma(double valor1, double valor2) { return valor1 + valor2; }
	
	public static double subt(double valor1, double valor2) { return valor1 - valor2; }
	
	public static double mult(double valor1, double valor2) { return valor1 * valor2; }
	
	public static double div(double valor1, double valor2) { return valor1 / valor2; }
	
	public static double pow(double valor1, double valor2) {
		double expoente = valor2, base = valor1;
		
		if(expoente == 0) {
			return 1;
		} else if(expoente == 1){
			return valor1;
		} else {
			for(int i = 1; i < expoente; i++) {
				valor1 *= base;
			}
			return valor1;
		}
	}
	
	public static double calcular(double valor1, char operador, double valor2) {
		double resultado = 0;
		
		switch(operador) {
		case '+': resultado = soma(valor1, valor2);
			break;
		case '-': resultado = subt(valor1, valor2);
			break;
		case '*': resultado = mult(valor1, valor2);
			break;
		case '/': resultado = div(valor1, valor2);
			break;
		case 'p': resultado = pow(valor1, valor2);
			break;
		default:
			break;
		}
		return resultado;
	}
}
