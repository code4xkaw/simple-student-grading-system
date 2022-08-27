import java.util.Scanner;

public class StudentManipulator {
    public static void main(String[] args){

        // declaring counter variables to count no. of students of each grade
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int countF=0;

        // all set.. lets run and see
        // here I'll chage the array length to 5,  b'cause it takes too much time to addd 20 students..
        // You can try adding any no. of students by changing the size variable..

        int size=5; // length of the array
        Student[] studentArray = new Student[size]; // array created with given length

        Scanner input = new Scanner(System.in);

        // storing details of students into the array
        for (int x=0; x< studentArray.length; x++){
            System.out.print("Enter student first name: ");
            String fName = input.next();
            System.out.print("Enter student second name: ");
            String sName = input.next();
            System.out.print("Enter student ID: ");
            String studentID = input.next();
            System.out.print("Enter student marks: ");
            double marks = input.nextDouble();
            System.out.println();

            // creating an object of type Student
            Student student = new Student(fName, sName, studentID, marks); // passing relevant attributes as in the constructor

            studentArray[x]=student; // storing the created student object in the studentArray
        }

        // determining the student grade
        for (int x=0; x< studentArray.length; x++){
            if (studentArray[x].getMarks()<39){
                countF+=1;
                System.out.println("First name: "+studentArray[x].getFirstName()+"  Second name: "+studentArray[x].getSecondName()+"  Student ID: "+studentArray[x].getStudentID()+"  Student marks: "+studentArray[x].getMarks()+"  Grade: F");
            }

            if (studentArray[x].getMarks()>39 && studentArray[x].getMarks()<63){
                countD+=1;
                System.out.println("First name: "+studentArray[x].getFirstName()+"  Second name: "+studentArray[x].getSecondName()+"  Student ID: "+studentArray[x].getStudentID()+"  Student marks: "+studentArray[x].getMarks()+"  Grade: D");
            }

            if (studentArray[x].getMarks()>63 && studentArray[x].getMarks()<75){
                countC+=1;
                System.out.println("First name: "+studentArray[x].getFirstName()+"  Second name: "+studentArray[x].getSecondName()+"  Student ID: "+studentArray[x].getStudentID()+"  Student marks: "+studentArray[x].getMarks()+"  Grade: C");
            }

            if (studentArray[x].getMarks()>75 && studentArray[x].getMarks()<87){
                countB+=1;
                System.out.println("First name: "+studentArray[x].getFirstName()+"  Second name: "+studentArray[x].getSecondName()+"  Student ID: "+studentArray[x].getStudentID()+"  Student marks: "+studentArray[x].getMarks()+"  Grade: B");
            }

            if (studentArray[x].getMarks()>87 && studentArray[x].getMarks()<=100){
                countA+=1;
                System.out.println("First name: "+studentArray[x].getFirstName()+"  Second name: "+studentArray[x].getSecondName()+"  Student ID: "+studentArray[x].getStudentID()+"  Student marks: "+studentArray[x].getMarks()+"  Grade: A");
            }
        }

        // printing no. of students of each grade
        System.out.println();
        System.out.println("<=======Student grade analysis=======>");
        System.out.println();
        System.out.println("Grade A: "+countA+ " students");
        System.out.println("Grade B: "+countB+ " students");
        System.out.println("Grade C: "+countC+ " students");
        System.out.println("Grade D: "+countD+ " students");
        System.out.println("Grade F: "+countF+ " students");
    }
}

// hope u've learned something new. // mainly how encapsulation works..
// like share and subscribe..
// Thank you..!!!