public class Main {

    public static void main(String[] args) {
        int [] grades = {6, 5, 4, 6, 5};
        int [] grades1 = {6, 6, 4, 3, 5};



        Student student = new Student("Simona","Dimitrovska","Proleterska 10","Female",22,4,grades);
        System.out.println(student);
        Student student1 = new Student("Sanja","Peteva","8Dekemvri","Female",21,3,grades1);
        System.out.println(student1);




    }
}
