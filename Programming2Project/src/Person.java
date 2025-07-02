public class Person {
    private String first;
    private String last;
    private int id;

    public Person(String first, String last, int id) {
        this.first = first;
        this.last = last;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", first, last, id); // Returns the full name and ID
    }
}