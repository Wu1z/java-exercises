package aula3exercicio8;
import java.util.Scanner;

@SuppressWarnings("all")
public class Leitura {
	public static String lerString(String msg) {
		System.out.println(msg);
		return lerString();
	}
	
	public static String lerString() {
		return new Scanner(System.in).nextLine();
	}
	
	public static int lerInt(String msg) {
		System.out.println(msg);
		return lerInt();
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
}
