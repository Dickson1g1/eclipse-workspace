
public class Time2 {
 

	private int hour; //0 - 23
	private int minute; //0 - 59
	private int second; //0 - 59

	public Time2() { // no argument cstr. 
		this(0, 0, 0);
		
	}
	
	public Time2(int hour) {
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public Time2(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
    }
	
	public Time2(Time2 time) {
		this(time.hour, time.minute, time.second);
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d" , hour, minute, second); 
	}
	
}
