public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String Address;
    public double[] grades;

    public double obliczSrednia() {
        double srednia = 0;

        if (grades.length > 20) {
            throw new IllegalArgumentException("Za dużo ocen");
        } else if (grades.length == 0) {
            throw new IllegalArgumentException("Brak ocen");
        } else if (grades.length < 0 && grades.length <= 20) {
            for (int i = 0; i < grades.length; i++) {
                srednia += grades[i];
            }
            srednia /= grades.length;
        }
    return srednia;
    }
}
