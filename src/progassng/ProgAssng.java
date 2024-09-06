/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progassng;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */

public class ProgAssng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("STUDENTMANAGEMENTAPPLICATION");
        Scanner scan=new Scanner(System.in);
        
        while(true){
            System.out.println("ENTER STUDENT MANAGEMENT APPLICATIONS");
            System.out.println("ENTER (1)TO LAUNCH MENU OR ANY OTHER KEY TO EXIT");
            String input= scan.nextLine();
            if(!input.equals("1")){
                Student.exitStudentApplication();
            }
            while(true){
                System.out.println("PLEASE SELECT ONE OF THE FOLLOWING:");
                System.out.println("(1) CAPTURE A NEW STUDENT");
                System.out.println("(2) SEARCH STUDENT");
                System.out.println("(3) DELETE STUDENT");
                System.out.println("(4) PRINT STUDENT REPORT");
                System.out.println("(5) EXIT APPLICATION");
                String choice=scan.nextLine();
                
                switch(choice){
                    case "1":
                        Student.saveStudent();
                        break;
                    case "2":
                        Student.searchStudent();
                        break;
                    case "3":
                        Student.deleteStudent();
                        break;
                    case "4":
                        Student.StudentReport();
                        break;
                    case "5":
                        Student.exitStudentApplication();
                        break;
                    default:
                        System.out.println("INVALID CHPOICE.PLEASE TRY AGAIN");
                }
                System.out.println("ENTER (1) TO LAUNCH MENU OR PRESS ANY OTHER KEY TO EXIT");
                String continueInput=scan.nextLine();
                if(!continueInput.equals("1")){
                    Student.exitStudentApplication();
                }
            }
            
        }
    }
    
}
