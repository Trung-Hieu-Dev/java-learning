
public class Main {
	public static void main(String[] args) {
		BirthDay date1 = new BirthDay(15, 5, 1987);
		BirthDay date2 = new BirthDay(18, 10, 1980);
		BirthDay date3 = new BirthDay(25, 5, 1975);
		
		Author author1 = new Author("Trung Hieu", date1);
		Author author2 = new Author("Le Ti", date2);
		Author author3 = new Author("Van Tun", date3);
		
		Book book1 = new Book("Java Programming", 10, 2023, author1);
		Book book2 = new Book("HTML For Begginer", 6.8, 2022, author2);
		Book book3 = new Book("Java Advance Book", 15.3, 2023, author3);
		
		
		book1.getBookName();
		book2.getBookName();
		book3.getBookName();
		
		System.out.println("Book 1 is same with Book 3: " + book1.checkSamePublishedYear(book3));
		System.out.println("Book 1 is same with Book 2: " + book1.checkSamePublishedYear(book2));
		
		System.out.println("Book 1 sale 10%: " + book1.salePrice(10));
		System.out.println("Book 2 sale 20%: " + book2.salePrice(20));
		System.out.println("Book 3 sale 15%: " + book3.salePrice(15));
		
	}
}
