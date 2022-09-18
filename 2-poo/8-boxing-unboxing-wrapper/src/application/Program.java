package application;

public class Program {

	public static void main(String[] args) {
		//Boxing: stack -> heap
		int x = 20;		
		Object obj = x;		
		System.out.println(obj);

		//Unboxing: heap -> stack
		int y = (int) obj;		
		System.out.println(y);
		
		//Wrapper: classes equivalentes aos tipos primitivos
		
		int x1 = 30;		
		Integer obj1 = x1;		
		System.out.println(obj1);

		//Não há necessidade do cast
		int y1 = obj1;
		System.out.println(y1);
	}

}
