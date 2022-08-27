public class Student {
    // declaring class attributes as private to achieve encapsulation
    private String firstName;
    private String secondName;
    private String studentID;
    private double marks;

    // creating a class constructor with four parameters
    public Student(String firstName, String secondName, String studentID, double marks){

        this.firstName=firstName;
        this.secondName=secondName;
        this.studentID=studentID;
        this.marks=marks;
    }

    // because we've declared class variables as private variables, we can't access them in the normal way.
    // So we need to use get method for this purpose.

    // generating getters to access class attributes

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getMarks() {
        return marks;
    }
}
