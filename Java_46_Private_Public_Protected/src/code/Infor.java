package code;

public class Infor {
	private int a; // use: in class
	int b;         // use: in class, same package
	protected int c; // use: in class, same package
	public int d;
	
	public void method() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
	}
}
