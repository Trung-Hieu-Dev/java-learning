
public class Main {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(5, 10, 2022);
		
		MyDate md2 = new MyDate(5, 10, 2022);
		
		MyDate md3 = new MyDate(10, 10, 2023);
		
		System.out.println(md1.equals(md2));
		
		System.out.println(md1.equals(md3));
		
		System.out.println(md3.hashCode());
	}
}
