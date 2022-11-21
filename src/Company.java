import java.util.Arrays;

public class Company {
    private String name;
    private String address;
    private Course[] courses;
    private String languageOgInstruction;

    public Company(String name, String address, Course[] courses, String languageOgInstruction) {
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.languageOgInstruction = languageOgInstruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getLanguageOgInstruction() {
        return languageOgInstruction;
    }

    public void setLanguageOgInstruction(String languageOgInstruction) {
        this.languageOgInstruction = languageOgInstruction;
    }
public static double income(Student[] students) {
    double sum = 0;
    for (Student student : students) {
        sum = student.getContract() + sum;

    }

    return sum;
}
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", languageOgInstruction='" + languageOgInstruction + '\'' +
                '}';
    }
}
