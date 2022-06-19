
public class One {
	int day;
	int month;
	int year;
	
	public int getDay() {
		return day;
	}
	
	public int setDay(int date) {
		return this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int setMonth(int month) {
		return this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public int setYear(int year) {
		return this.year = year;
	}
	One(){
		
	}
	
	One(int d,int m, int y){
		day = d;
		month = m;
		year = y;
	}
	
	void showDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
	
	void swapDates() {
		
	}
	
	public static void main(String args[]) {
		One d = new One();
		d.setDay(7);
		d.setMonth(2);
		d.setYear(2022);
		d.showDate();
		
		//One d1 = new One(7,2,2022);
		//d1.showDate();
		
	}
}
