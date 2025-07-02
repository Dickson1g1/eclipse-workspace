public class Teacher extends Person {
    private String area;

    public Teacher(String first, String last, int id, String area) {
        super(first, last, id);
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("%s | Area of Expertise: %s", 
                             super.toString(), area); // Returns personal info and area of expertise
    }
}