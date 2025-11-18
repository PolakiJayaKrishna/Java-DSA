package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student App ---");
            System.out.println("1. Add student");
            System.out.println("2. List students");
            System.out.println("3. Update marks");
            System.out.println("4. Pay fees");
            System.out.println("5. Show role");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number option.");
                continue;
            }

            switch(choice) {

                case 1:
                    try{
                        System.out.print("Enter name: ");
                        String name = sc.nextLine().trim();

                        System.out.print("Enter age: ");
                        int age = Integer.parseInt(sc.nextLine().trim());

                        System.out.print("Enter marks: ");
                        int marks = Integer.parseInt(sc.nextLine().trim());

                        System.out.print("Enter regNo: ");
                        long regNo = Long.parseLong(sc.nextLine().trim());

                        System.out.print("Enter department: ");
                        String dept = sc.nextLine().trim();

                        Student s = new Student(name, age, marks, regNo, dept);
                        students.add(s);
                        System.out.println("Student added: " + s.getName());
                    }
                    catch(NumberFormatException nef){
                        System.out.println("Invalid number input. Try again.");
                    }
                    catch(IllegalArgumentException iea){
                        System.out.println("Input error: " + iea.getMessage());
                    }
                    break;

                case 2:
                    if(students.isEmpty())
                        System.out.println("No students yet.");
                    else {
                        System.out.println("\n--- Student List ---");
                        int i = 1;
                        for(Student s : students){
                            System.out.println(i++ + ". " + s);
                        }
                    }
                    break;

                case 3:
                    if(students.isEmpty()){
                        System.out.println("No students to update.");
                        break;
                    }

                    System.out.println("\n--- Choose Student to Update Marks ---");
                    int i2 = 1;
                    for(Student s : students){
                        System.out.println(i2++ + ". " + s.getName());
                    }

                    System.out.print("Enter student number: ");
                    int index = Integer.parseInt(sc.nextLine().trim());

                    if(index < 1 || index > students.size()){
                        System.out.println("Invalid student number.");
                        break;
                    }

                    Student selected = students.get(index - 1);

                    try {
                        System.out.print("Enter new marks: ");
                        int newMarks = Integer.parseInt(sc.nextLine().trim());
                        selected.setMarks(newMarks);
                        System.out.println("Marks updated for " + selected.getName());
                    } catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    if(students.isEmpty()){
                        System.out.println("No students available.");
                        break;
                    }

                    System.out.println("\n--- Choose Student to Pay Fees ---");
                    int j = 1;
                    for(Student s : students){
                        System.out.println(j++ + ". " + s.getName());
                    }

                    System.out.print("Enter student number: ");
                    int idx = Integer.parseInt(sc.nextLine().trim());

                    if(idx < 1 || idx > students.size()){
                        System.out.println("Invalid student number.");
                        break;
                    }

                    Student st = students.get(idx - 1);
                    st.payFees();
                    break;

                case 5:
                    if(students.isEmpty()){
                        System.out.println("No students available.");
                        break;
                    }

                    System.out.println("\n--- Choose Student to Show Role ---");
                    int k = 1;
                    for(Student s : students){
                        System.out.println(k++ + ". " + s.getName());
                    }

                    System.out.print("Enter student number: ");
                    int id = Integer.parseInt(sc.nextLine().trim());

                    if(id < 1 || id > students.size()){
                        System.out.println("Invalid student number.");
                        break;
                    }

                    Student sel = students.get(id - 1);
                    sel.showRole();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
