import java.util.ArrayList;

public class StudentGroup {
    public String nazwa;

    int maksymalnaIloscStudentów=15;
    ArrayList <Student> studentList = new ArrayList<Student>();
    public void dodajNowegoStudenta(){
     if(studentList.contains(student)){
         throw new IllegalStateException("Student już jest wpisany");
     }
    if(studentList.size()+1 > maksymalnaIloscStudentów){
        throw new IllegalArgumentException("Liczba studentów jest za duża");
    }

    }
}
