package aula3exercicio9;
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
	
	public static char lerChar(String msg) {
		System.out.println(msg);
		return lerChar();
	}
	
	public static char lerChar() {
		return new Scanner(System.in).next().charAt(0);
	}
	
	public static int lerInt(String msg) {
		System.out.println(msg);
		return lerInt();
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
}
