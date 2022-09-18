//import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int qtd = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<qtd; i++) {
			int numero = sc.nextInt();
			soma += numero;						
		}		
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}
	
}