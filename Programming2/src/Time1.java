
public class Time1 {

	private int hour; //0 - 23
	private int minute; //0 - 59
	private int second; //0 - 59

	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d" , hour, minute, second); 
	}
	
}


