package entities;

public class Triangle {

	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double area() {
		double p = (ladoA + ladoB + ladoC) / 2.0;
		
		return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
	}
}	
