public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Timur", "Takhtashov", "s234234", "s234234@pjwstk.edu.pl",
                "Warszawa", new double[]{3.0, 5.3, 4.6, 3.5});
        Student student2 = new Student("Pavel", "Valerko", "s34534", "34534@pjwstk.edu.pl",
                "Warszawa", new double[]{2.3, 3.4, 2.9, 4.7});
        Student student3 = new Student("Alina", "Tyszkievicz", "s78349", "s78349@pjwstk.edu.pl",
                "Warszawa", new double[]{4.5, 5.5, 4.2, 2.8});
        Student student4 = new Student("Jaroslaw", "Jablonski", "s58454", "s58454@pjwstk.edu.pl",
                "Warszawa", new double[]{2.0, 1.7, 3.0, 3.3});
        Student student5 = new Student("Andrzej", "Lomski", "s458443", "s458443@pjwstk.edu.pl",
                "Warszawa", new double[]{5.0, 5.5, 4.8, 4.6});
        StudentGroup studentGroup = new StudentGroup("group1", new Student[]{student1, student2, student3,
                student4});
        System.out.println(student1.countAverageMark());

        studentGroup.addStudent(student5);
        System.out.println(studentGroup.students.length);

        for(int i = 0; i < studentGroup.students.length; i++) {
            System.out.println(studentGroup.students[i]);
        }
    }
}