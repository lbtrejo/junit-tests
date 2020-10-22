import java.util.ArrayList;

public class Student {

    private final long studentId;
    private String studentName;
    private ArrayList<Integer> grades;

    public Student(long id, String name){
        this.studentId = id;
        this.studentName = name;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return this.studentId;
    }
    public String getName(){
        return this.studentName;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int grade: this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
