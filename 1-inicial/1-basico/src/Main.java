import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		char sexo;
		
		//int y = 32;
		//double x = 10.35784;
		//String nomeFixo = "Maria";
		//int idadeFixa = 31;
		//double renda = 4000.0;
		
		//System.out.println(y);
		//System.out.println(x);
		//System.out.printf("%.2f%n", x);
		//Locale.setDefault(Locale.US);
		//System.out.printf("%.4f metros\n", x);
		//System.out.println("Resultado = " + x);		
		//System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nomeFixo, idadeFixa, renda);
		
		System.out.print("Digite o nome: ");
		nome = sc.nextLine();
	
		
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		
		System.out.print("Digite o sexo: ");
		sexo = sc.next().charAt(0);
		
		System.out.print("Digite o salário: ");
		salario = sc.nextDouble();
		
		System.out.printf("Voce digitou o nome %s, idade %d, sexo %s, salário %.2f ", nome, idade, sexo, salario);
	
		
		sc.close();
		
		//System.out.println("Olá mundo!");		
		//System.out.println("Bom dia!");

	}

}
