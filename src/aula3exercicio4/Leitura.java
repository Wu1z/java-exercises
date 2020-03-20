package aula3exercicio4;
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
}
