package td.bonus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum sum = new Sum(1,2);
		Multiply multiply = new Multiply(1,2);
		Substract substract = new Substract(1,2);
		
		System.out.println(sum.compute());
		System.out.println(substract.compute());
		System.out.println(multiply.compute());

	}

}
