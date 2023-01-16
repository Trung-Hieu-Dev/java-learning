import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
	}

	public MyDate(int d, int m, int y) {
		if(d >= 1 && d <= 31) {
			this.day = d;			
		} else {
			this.day = 1;
		}
		
		if(m >= 1 && m <= 12) {
			this.month = m;			
		} else {
			this.day = 1;
		}
		
		if(y >= 2022) {
			this.year = y;			
		} else {
			this.year = 2022;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [day=" + this.day + ", month=" + this.month + ", year=" + this.year + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
	
	
}
