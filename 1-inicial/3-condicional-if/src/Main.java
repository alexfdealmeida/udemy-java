import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		int minutosExcedidos;
		double valorBasico = 50.00;
		double valorExcedido = 0.00;
		double valorTotal;
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe a quantidade de minutos consumida no plano de telefonia:");
		minutos = sc.nextInt();
		
		if (minutos > 100) {					
			minutosExcedidos = minutos - 100;
			valorExcedido = minutosExcedidos * 2;
		}
		
		valorTotal = valorBasico + valorExcedido;
		
		System.out.printf("Valor total: R$ %.2f", valorTotal);
		
		sc.close();
	}

}
