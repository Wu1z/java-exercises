package aula3exercicio5;

public class MyMath {
	public static int fatorial(int numero) {
		int fatorial = 1;
		
		for(int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	public static int maior(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
	
	public static boolean isPar(int numero) {
		if(numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void isPrimo(int numero) {
		int cont = 0;
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				cont++;
			}
		}
		
		if(cont == 2) {
			System.out.println("O número [" + numero + "] é primo!");
		} else {
			System.out.println("O número [" + numero + "] NÃO é primo!");
		}
	}
}
