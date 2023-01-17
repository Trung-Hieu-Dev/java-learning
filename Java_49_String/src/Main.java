import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("--------");
		
		//Length
		System.out.println(s.length());
		int doDai = s.length();
		
		//charAt -> lay ra vi tri 1 ky tu bat ky
		for (int i = 0; i < doDai; i++) {
			System.out.println("Vi tri " + i + " la " + s.charAt(i));
		}
		System.out.println("--------");
		
		//getChars
		char[] arrayChar = new char[10];
		s.getChars(2, 4, arrayChar, 0);
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.println("Gia tri cua mang tai " + i + " la " + arrayChar[i]);
		}
		System.out.println("--------");
		
		
	}
}
