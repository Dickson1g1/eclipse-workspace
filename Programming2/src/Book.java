
public enum Book {
	JHTP("Java How To Program", "2018"),
	CHIP("C How to Program", "2016"),
	IW3HTP("Internet", "2012"),
	CPPHTP("C++", "2017"),
	VBHTP("VB", "2014"),
	CSHARPHTP("C#", "2017");
	
	// instance fields
	private final String title;
	private final String copyrightYear;
	
	
	// enum crts 
	Book(String title, String copyrightYear) {
		this.title = title;
		this.copyrightYear = copyrightYear;
	}
	
	public String getTitle() {
		return title; 
	}
	
	public String getCopyrightYear() {
		return copyrightYear;
	}

}
