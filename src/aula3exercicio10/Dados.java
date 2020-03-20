package aula3exercicio10;

public class Dados {
	// Criar o objeto dos Pilotos e solicita as informações
	public static Piloto[] criarPilotos(int n) {
		Piloto [] pilotos = new Piloto[n];
		
		for(int i = 0; i < n; i++) {
			pilotos[i] = lerPiloto();
		} return pilotos;
	}
	
	// Solicita todos os valores para o piloto
	public static Piloto lerPiloto() {
		Piloto a = new Piloto();
		
		a.nome = Leitura.lerString("Informe o nome do piloto: ");
		a.scuderia = Leitura.lerString("Scuderia: ");
		a.volta = Leitura.lerInt("Volta (min): ");
		a.volta = novoValor(a);
		System.out.println("==========================");
		
		return a;
	}
	
	public static void showResults(Piloto[] a) {
		moreFast(a);
		moreSlow(a);
		mediaVolta(a);
	}
	
	// Verifica volta mais lenta
	public static void moreSlow(Piloto[] a) {
		String slowPilot = "";
		int voltaLenta = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i].volta > voltaLenta) {
				voltaLenta = a[i].volta;
				slowPilot = a[i].nome;
			}
		}
		System.out.println("Piloto mais lento: " + slowPilot + " (volta em " + voltaLenta + " min)");
	}
	
	// Verifica volta mais rapida
	public static void moreFast(Piloto[] a) {
		String fastPilot = "";
		int voltaRapida = 61;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i].volta < voltaRapida) {
				voltaRapida = a[i].volta;
				fastPilot = a[i].nome;
			}
		} 
		System.out.println("Piloto mais rápido: " + fastPilot + " (volta em " + voltaRapida + " min)");
	}
	
	// Soma o valor de todas as volta para calcular a media
	public static int somaVolta(Piloto[] a) {
		int soma = 0;
		for(int i = 0; i < a.length; i++) {
			soma += a[i].volta;
		} return soma;
	}
	
	// Tira a media das voltas
	public static void mediaVolta(Piloto[] a) {
		int media = 0;
		
		media = somaVolta(a) / a.length;
		System.out.println("Media das Voltas: " + media + " min");
	}
	
	// Pedir novo valor para a volta
	public static int novoValor(Piloto a) {
		while(!validaVolta(a.volta)) {
			a.volta = Leitura.lerInt("Volta > 1 e < 60 (min): ");
		} return a.volta;
	}
	
	// Validar se a volta tem o valor certo
	public static boolean validaVolta(int volta) {
		if(volta < 1 || volta > 60) {
			return false;
		} else {
			return true;
		}
	}
}
