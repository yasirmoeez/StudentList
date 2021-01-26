
package studentlist;

import java.util.Scanner;

/**
 *
 * @author paulbonenfant
 */
public class StudentList {

    public static void main(String[] args) {
//changing size from 2 to 3 in 2nd commit
        // Create an array to hold 3 instances of Student
        Student[] students = new Student[3];
        
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter student names");

        for (int i = 0; i < students.length; i++) {        
            System.out.println("Enter name for student " + (i + 1));            
            String name = input.nextLine();
            
            students[i] = new Student(name);        
        }

        System.out.println("Here are the students");
        
        String format = "Student name is %s\n";
        
        // Use a for-each loop
        for (Student student: students) {
            System.out.printf(format, student.getName());
        }         
    }
}
