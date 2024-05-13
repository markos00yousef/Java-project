public class Professor extends Student {

    String expertise;

    Professor(String name, int year, String college, String expertise) {
        super(name, year, college);
        this.expertise = expertise;
    }
    
}
