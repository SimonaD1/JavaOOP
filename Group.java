public class Group extends Student {
    private int numberOfStudents;
    private Student [] students = new Student[30];
    public Group()
    {
        numberOfStudents = 0;
    }
    public Group(int numberOfStudents, Student [] students)
    {
        setNumberOfStudents(numberOfStudents);
        setStudents(students);
    }
    final void setNumberOfStudents(int numberOfStudents)
    {
        this.numberOfStudents = numberOfStudents;
    }
    final int getNumberOfStudents()
    {
        return numberOfStudents;
    }
    final void setStudents(Student [] students)
    {
        for (int i = 0; i < students.length; i++)
        {
            this.students[i] = students[i];
        }
    }
    final Student[] getStudents()
    {
        return students;
    }
    public int getScholarshipStudentsCount()
    {
        int countStudents = 0;
        for (int i = 0; i < students.length; i++)
        {
            if(students[i].getGPA() > 4.50)
            {
                countStudents++;
            }
        }
        return countStudents;
    }
    double getGPA()
    {
        double averageGroup = 0;
        for (int i = 0; i < students.length; i++)
        {
            averageGroup = averageGroup + students[i].getGPA();
        }
        return averageGroup/numberOfStudents;
    }
    int findStudent(String name)
    {
        for (int i = 0 ; i < students.length; i++)
        {
            if (students[i].getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }
    int findStudentByFn(String FNN)
    {
        for (int i = 0; i < students.length; i++)
        {
            if(students[i].getFNN().equals(FNN))
            {
                return i;
            }
        }
        return -1;
    }

}
