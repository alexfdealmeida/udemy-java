import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		String dia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dia sequencial: ");
		x = sc.nextInt();		
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
