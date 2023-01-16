
public class Book {
	private String book;
	private double price;
	private int year;
	private Author author;
	
	public Book(String book, double price, int year, Author author) {
		this.book = book;
		this.price = price;
		this.year = year;
		this.author = author;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getyear() {
		return year;
	}

	public void setyear(int year) {
		this.year = year;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void getBookName() {
		System.out.println(this.book);
	}
	
	public boolean checkSamePublishedYear(Book otherBook) {
//		if(this.year == otherBook.year) {
//			return true;
//		} else {
//			return false;
//		}
		return this.year == otherBook.year;
	}
	
	public double salePrice(double x) {
		return this.price - (this.price * x) / 100;
	}
	
}
