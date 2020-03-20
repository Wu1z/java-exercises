package aula3exercicio6;
import java.util.Scanner;

@SuppressWarnings("all")
public class Leitura {
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	public static int lerInt(String msg) {
		System.out.println(msg);
		return lerInt();
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
}
