package td.bonus;

public class Multiply extends Sum {

	public Multiply(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compute() {
		return super.a * super.b;
	}

}
