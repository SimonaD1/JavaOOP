import javax.xml.namespace.QName;

public class Student extends Person {
    private final String FNN;
    private static long count = 1;
    private int course;
    private int [] grades = new int[5];
    public Student()
    {

        FNN = null;
        course = 1;
    }
    public Student(String name, String lastname, String address, String gender, int age, int course, int [] grades)
    {
        super(name,lastname,address,gender,age);
        FNN = String.format("85528%d",count++);
        setCourse(course);
        setGrades(grades);
    }
    final void setCourse(int course)
    {
        this.course = course;
    }
    final int getCourse()
    {
        return this.course;
    }
    final void setGrades(int [] grades)
    {
        for (int i = 0; i < grades.length; i++)
        {
            this.grades[i] = grades[i];
        }
    }
    final int [] getGrades()
    {
        return grades;
    }
    final String getFNN()
    {
        return FNN;
    }
    double getGPA()
    {
        double average = 0;
        for (int i = 0; i < grades.length; i++)
        {
            average = average + grades[i];
        }
        return average/5;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() +  course + " " +  "course" + " " + "FacultyNumber: " + FNN;
    }
}
