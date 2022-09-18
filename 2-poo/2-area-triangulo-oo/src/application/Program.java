package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//double xA, xB, xC, yA, yB, yC;
		Triangle trianguloX = new Triangle();
		Triangle trianguloY = new Triangle();		
		
		System.out.println("Enter the measures of triangle X: ");
		trianguloX.ladoA = sc.nextDouble();
		trianguloX.ladoB = sc.nextDouble();
		trianguloX.ladoC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		trianguloY.ladoA = sc.nextDouble();
		trianguloY.ladoB = sc.nextDouble();
		trianguloY.ladoC = sc.nextDouble();
		
		//double p = (trianguloX.ladoA + trianguloX.ladoB + trianguloX.ladoC) / 2.0;
		
		//double areaX = Math.sqrt(p * (p - trianguloX.ladoA) * (p - trianguloX.ladoB) * (p - trianguloX.ladoC));
		
		//p = (trianguloY.ladoA + trianguloY.ladoB + trianguloY.ladoC) / 2.0;
		
		//double areaY = Math.sqrt(p * (p - trianguloY.ladoA) * (p - trianguloY.ladoB) * (p - trianguloY.ladoC));
		
		double areaX = trianguloX.area();
		double areaY = trianguloY.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
	
}