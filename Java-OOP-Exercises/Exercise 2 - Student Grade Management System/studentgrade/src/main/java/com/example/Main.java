package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter Student's ID : ");
            String id = sc.nextLine();

            System.out.println("Enter Student's Name : ");
            String name = sc.nextLine();

            System.out.println("Enter Student's department : ");
            String dep = sc.nextLine();

            Student student = new Student(id, name, dep);

            while(true){
            
            System.out.println("   #####################################");
            System.out.println("   #         Student Grade System      #");
            System.out.println("   #####################################");
            System.out.println("");
            System.out.println("   Please Enter Your Choice:");
            System.out.println("   1.Add Grad");
            System.out.println("   2.Remove Grade");
            System.out.println("   3.Show Student Information");
            System.out.println("   0.Exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    while(true){
                        System.out.println("Enter A Grade Between 0 & 100 :");
                        double g =sc.nextDouble();
                        if(g == -1){
                            break;
                        }
                        student.addGrade(g);
                    }
                    break;
                case 2:
                    System.out.println("Enter The Index Of Grade :");
                    int index = sc.nextInt();
                    student.removeGrade(index);  
                    break;
                case 3:
                    student.getStudentInfo();
                    break;
                case 0:
                    System.out.println("GOODBYE...");  
                    return;
                default:
                    System.out.println("Invalid Choice!");         
        
            }
        }
            
            
        

        
    }
    
}
