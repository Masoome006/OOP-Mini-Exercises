package com.example;

import java.util.ArrayList;

public class Student {

    private String id;
    private String name;
    private ArrayList<Double> grades; 
    private String department;

    public Student(String id , String name , String department){

        this.id = id;
        this.name = name;
        this.department = department;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade){

        if(grade < 0.0 || grade > 100.0 ){
            System.out.println("Enter A Valid Grade! Grade shoulf Be Between 0 and 100.");
            return;
        }
        grades.add(grade);
        
    }

    public void removeGrade(int index){
        if(index < 0 || index > grades.size()){
            System.out.println(" Invalid index !");
            return;
        }
        double removed  = grades.remove(index);
        System.out.println("Grade '" + removed + "' Removed.");
    }

    public double calculateAvrg(){
        if(grades.isEmpty()){
            System.out.println("There Is No Grades!");
            return 0.0;
        }
        double sum = 0.0;
        for(double g : grades){
            sum += g;
        }
        return sum/grades.size();
    }

    public double getHighestgrade(){
        if(grades.isEmpty()){
            System.out.println("There Is No Grades!");
            return 0.0 ;
        }
        double highest = grades.get(0);
        for(double g : grades){
            if(g > highest){
                highest = g;
            }
        }
        return highest;
    }

    public double getLowestGrade(){
        if(grades.isEmpty()){
            System.out.println("There Is No Grades!");
            return 0.0;
        }
        double lowest = grades.get(0);
        for(double g : grades){
            if(g < lowest){
                lowest = g;
            }
        }
        return lowest;
    }

    public String getLettergrade(){
        if(grades.isEmpty()){
            System.out.println("There Is No Grades!");
            return null;
        }
        double avrg = calculateAvrg();
        if(avrg >= 90){
           return "A" ;
        }
        else if(avrg >= 80){
            return "B";
        }
        else if(avrg >= 70){
            return "C";
        }
        else if(avrg >= 60){
            return "D";
        }
        else{
            return "F";
        }
    }

    public void getStudentInfo(){
        System.out.println("   #####################################");
        System.out.println("   #        STUDENT INFORMATION        #");
        System.out.println("   #####################################");
        System.out.println("");
        System.out.println("   Student ID : " + id);
        System.out.println("   Student Name : " + name);
        System.out.println("   Student Department : " + department);
        System.out.println("   Avarage Grade : " + calculateAvrg());
        System.out.println("   Highest Grade : " + getHighestgrade());
        System.out.println("   Lowest Grade : " + getLowestGrade());
        System.out.println("   Letter Grade : " + getLettergrade());
    
    }



    
}
