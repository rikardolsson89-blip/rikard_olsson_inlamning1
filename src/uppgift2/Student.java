package uppgift2;

public class Student {

    private String firstName;
    private String lastName;
    private String schoolName;
    private int age;

    public Student(String firstName, String lastName, String schoolName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return  lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}