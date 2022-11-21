import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(102030909L,"Aleksey Stas", (byte) 29,'M',8000);
        Student student2 = new Student(102030401L,"Ivan Ivanov", (byte) 25,'M',8000);
        Student student3 = new Student(102030401L,"Akylbek Bereshev", (byte) 34,'M',8000);

        Student[] students ={student1,student2,student3};
        for (Student student : students) {
            System.out.println(student);

        }
        System.out.println("Total summ of all students:"+Company.income(students));
        Instructor instructor=new Instructor(5003408L,"Muhammed Toichubay u", (byte) 28,'M',35000);
        System.out.println(instructor);


        Mentor mentor1 = new Mentor(123459L,"Kurmanjan Jakysheva", (byte) 25,'F',34000);
        Mentor mentor2 = new Mentor(123454L,"Aizhamal Asangazieva", (byte) 27,'F',38000);
        Mentor mentor3 = new Mentor(123457L,"Kurmanjan Jakysheva", (byte) 26,'F',40000);
        Mentor[] mentors ={mentor1,mentor2,mentor3};


        Group group1 = new Group("Java",students,1,29);
        Group group2 = new Group("Java",students,1,1);
        Group group3 = new Group("Java",students,1,30);
        Group[] groups = {group1,group2,group3};


        Course course1 = new Course("Java", groups, instructor,mentors);
        Course course2 = new Course("Java", groups, instructor,mentors);
        Course course3 = new Course("Java", groups, instructor,mentors);
        Course[] course = {course1,course2,course3};

        Company PeaksoftHouse = new PeaksoftHouse("Peaksoft", "Grajdanskiy", course , "java");
        for (Student student:students) {
            System.out.println("student contract for month:"+student.getContract());
        }

        for (Mentor mentor:mentors) {
            System.out.println("mentor salary for month:"+mentor.getSalary());
        }
        for (Student student:students) {
            System.out.println("student contract for period:"+student.period(group1));


        }
        for (Mentor mentorI:mentors){
            System.out.println("mentor salary for period:"+mentorI.period(group1));
        }
        Person[] people = {student1,student2,student3, mentor1, mentor2, mentor3, instructor};
        sortAge(people);


    }
    public static void sortAge(Person[] person){
        int[] a = new int[person.length];
        int index = 0;
        for (Person persons:person) {
            a[index] = persons.getAge();
            index++;
        }
        Arrays.sort(a);
        System.out.println("age"+Arrays.toString(a));

    }

}