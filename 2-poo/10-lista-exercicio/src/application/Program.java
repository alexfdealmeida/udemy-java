package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println();
			sc.nextLine();
			
			System.out.print("Employee #" + (i + 1) + ":");
			System.out.println();
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (getEmployee(list, id) != null) {
				System.out.println("Id already taken. Please try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		//Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		Employee employee = getEmployee(list, id);
		
		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			
			//list.get(list.indexOf(employee)).increaseSalary(percentage);
			employee.increaseSalary(percentage);
		}
		
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee object : list) {
			System.out.println(object);
		}
		
		sc.close();
	}
	
	public static Employee getEmployee(List<Employee> list, int id) {
		return list.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
	}

}
