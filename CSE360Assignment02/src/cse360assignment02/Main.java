package cse360assignment02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddingMachine a = new AddingMachine();
		a.add(4);
		a.subtract(2);
		a.add(5);
		String x = a.toString();
		System.out.println(x);
		a.clear();
	

	}

}
