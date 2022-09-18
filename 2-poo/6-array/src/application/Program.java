package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Count Height: ");
		int n = sc.nextInt();
			
		double[] vect = new double[n];
				
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Height " + (i + 1) + ":");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Average Height: %.2f", avg);
				
		sc.close();
	}

}
