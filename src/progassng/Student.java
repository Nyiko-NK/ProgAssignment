/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progassng;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private String email;
    private String course;
 
    private static ArrayList<Student> students =new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    //CONSTRUCTOR
    public Student(String id, String name, int age, String email, String course){
        System.out.println("STUDENT APPLICATION");
        this.id=id;
        this.name=name;
        this.age= age;
        this.email=email;
        this.course=course;
    }
    //METHOD TO CAPTURE OR SAVE A NEW STUDENT
    public static void saveStudent(){
        System.out.println("CAPTURE A NEW STUDENT");
       
        System.out.println("ENTER STUDENT ID:");
        String id = scan.nextLine();
        
        System.out.println("ENTER STUDENT NAME:");
        String name = scan.nextLine();
        
        int age;
        while(true){
            System.out.println("ENTER STUDENT AGE:");
         try    {
                age = Integer.parseInt(scan.nextLine());
                if(age>=16)break;
                else System.out.println("INCORRECT STUDENT AGE!PLEASE ENTER CORRECT AGE");
           } catch (NumberFormatException e){
                   System.out.println("INVALID AGE INPUT!ONLY NUMBERS ARE ALLOWED.PLEASE RE-ENTER AGE");
         }
        }
        
        System.out.println("ENTER STUDENT EMAIL:");
        String email=scan.nextLine();
        
        System.out.println("ENTER STUDENT COURSE:");
        String course=scan.nextLine();
        
        students.add(new Student(id, name, age, email, course));
        System.out.println("!!STUDENT DETAILS HAVE BEEN SAVED!!");
    }
    //METHOD TO SEARCH A STUDENT
    public static void searchStudent(){
        System.out.println("ENTER STUDENT ID TO SEARCH");
        String id= scan.nextLine();
        
        for(Student student : students){
            if(student.id.equals(id)){
                System.out.println("STUDENT ID"+ student.id);  
                System.out.println("STUDENT NAME"+ student.name);
                System.out.println("STUDENT AGE"+ student.age);
                System.out.println("STUDENT EMAIL"+ student.email);
                System.out.println("STUDENT COURSE"+student.course);
                return;
            }
        }
        System.out.println("STUDENT WITH STUDENT ID"+id+"IS NOT FOUND");
    }
    //METHOD TO DELETE A STUDENT
    public static void deleteStudent(){
        System.out.println("ENTER STUDENT ID TO DELETE");
        String id=scan.nextLine();
        for(Student student : students){
            if(student.id.equals(id)){
                System.out.println("DO YOU WAT TO DELETE A STUDENT!!");
                String comformation=scan.nextLine();
                
                if(comformation.equalsIgnoreCase("YES")){
                    students.remove(student);
                    System.out.println("STUDENT WITH STUDENT ID"+id+"IS DELETED!");
                }else{
                    System.out.println("DELETION HAS BEEN CANCELLED");
                }
                return;
            }
           
        }
        System.out.println("STUDENT WITH STUDENT ID"+id+"CANNOT BE FOUND!");
}
    //METHOD TO PRINT STUDENT REPORT
    public static void StudentReport(){
        if(students.isEmpty()){
            System.out.println("NO STUDENTS AVAILABLE TO DISPLAY");
            return;
        }
        int studentcount=1;
        for(Student student : students){
             System.out.println("STUDENT ID"+ student.id);  
                System.out.println("STUDENT NAME"+ student.name);
                System.out.println("STUDENT AGE"+ student.age);
                System.out.println("STUDENT EMAIL"+ student.email);
                System.out.println("STUDENT COURSE"+student.course);
                System.out.println("");  
        }
    }
    //METHOD TO EXIT APPLICATION
    public static void exitStudentApplication(){
        System.out.println("EXITING STUDENT APPLICATION");
        System.exit(0);
    }
}
