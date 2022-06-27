package td.bonus;

public class Substract extends Sum{

	public Substract(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compute() {
		return super.a - super.b;
	}

}
