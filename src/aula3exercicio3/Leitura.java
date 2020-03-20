package aula3exercicio3;
import java.util.Scanner;

@SuppressWarnings("all")
public class Leitura {
	
	public static int lerInt(String msg) {
		System.out.print(msg);
		return lerInt();
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static double lerDouble(String msg) {
		System.out.print(msg);
		return lerDouble();
	}
	
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static char lerChar(String msg) {
		System.out.print(msg);
		return lerChar();
	}
	
	public static char lerChar() {
		return new Scanner(System.in).next().charAt(0);
	}
}
