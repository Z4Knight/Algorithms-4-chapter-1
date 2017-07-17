package chapter1_2_11And12;

interface Dateable{
	int month();
	int day();
	int year();
}

public class SmartDate implements Dateable {
	private final int month;
	private final int day;
	private final int year;
	@Override
	public int month() {
		// TODO Auto-generated method stub
		return month;
	}
	@Override
	public int day() {
		// TODO Auto-generated method stub
		return day;
	}
	@Override
	public int year() {
		// TODO Auto-generated method stub
		return year;
	}
	
	// 根据日期返回对应的星期
	public String dayOfTheWeek(){
		int w = 0;
		if(month == 1){
			w = ((year-1) / 100 / 4 - 2 *((year-1) / 100) + (year-1) % 100 + (year-1) % 100 / 4 + 26 * 
					(month + 14) / 10 + day - 1) % 7;
		}
		if(month == 2){
			 w = ((year-1) / 100 / 4 - 2 *((year-1) / 100) + (year-1) % 100 + (year-1) % 100 / 4 + 26 * 
					(month + 15) / 10 + day - 1) % 7;
		}else{
			w = (year / 100 / 4 - 2 *(year / 100) + year % 100 + year % 100 / 4 + 26 * 
				(month + 1) / 10 + day - 1) % 7;
		
		}
		switch (w) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
			
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";

		case 5:
			return "Friday";
	
		case 6:
			return "Saturday";
			
		default:
			return "Sunday";
		}
	}
	
	// 是否是闰年
	public static boolean isLeapYear(int year){
		return (year % 4 ==0 && year % 100 != 0 || year % 400 == 0);

	}
	
	// 日期是否合法
	public static boolean isIllegal(int m, int d, int y){
		if (y < 0 | d < 1 | d > 31) {
			return false;
		}else if (m < 0 || m > 12) {
			return false;
		}
			int [] monthOfDay = {
					0,31,-1,31,30,31,31,30,31,31,30,31,31
			};
			if (isLeapYear(y)) {
				monthOfDay[2] = 29;
			}else{
				monthOfDay[2] = 28;
			}
			if (d > monthOfDay[m]) {
				return false;
			}else{
				return true;
			}
		}
	
	public SmartDate(int m, int d, int y){
		if (!isIllegal(m, d, y)) {
			throw new IllegalArgumentException("Illegal data");
		}else{
			month = m;
			day = d;
			year = y;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (month() + "/" + day() + "/" + year());
	}
	
	public static void main(String[] args) {
		SmartDate smartDate = new SmartDate(2, 9, 2017);
		System.out.println(smartDate+
				" the day of the week: " +smartDate.dayOfTheWeek());
	}
	
}


