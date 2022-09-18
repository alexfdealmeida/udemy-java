package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");		
		list.add(2, "Marco");
		list.add("André");
		list.add("Alan");
		list.add("Leidiane");
		
		System.out.println(list.size());
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------");

		//Remover elemento na posição 1 da lista (Alex)
		list.remove(1);
		
		//Remover elemento identificado pelo nome
		list.remove("Anna");
		
		//Remover utilizando predicado (lambda) - todos os elementos cujo nome inicie com 'M'
		list.removeIf(y -> y.charAt(0) == 'M');
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		
		System.out.println("Index of Bob: " + list.lastIndexOf("Bob"));
		System.out.println("Index of Bob: " + list.lastIndexOf("Marco"));
		
		System.out.println("----------------------");
		
		//Converte para stream, para permitir trabalhar com lambda, e depois converte para List novamente
		List<String> result = list.stream().filter(z -> z.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x: result) {
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		
		//Encontrar o primeiro elemento da lista que inicie com 'A', caso não encontre, retorna null
		String nome = list.stream().filter(z -> z.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}

}
