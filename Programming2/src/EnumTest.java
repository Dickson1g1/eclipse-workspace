import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {
		for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)) {
			System.out.println(book + "--" + book.getTitle() + "--" + book.getCopyrightYear()); 
		}

	}

}
