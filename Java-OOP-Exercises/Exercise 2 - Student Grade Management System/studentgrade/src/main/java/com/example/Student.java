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
        System.out.println("Grade Added Succussfully.");
    }

    public void removeGrade(int index){
        if(index < 0 || index > grades.size()){
            System.out.println(" Invalid index !");
            return;
        }
        double removed  = grades.remove(index);
        System.out.println("Grade '" + removed + "' Removed.");
    }

    public void calculateAvrg(){
        if(grades.isEmpty()){
            System.out.println("There Is No Grades!");
            return;
        }
        double sum = 0.0;
        for(double g : grades){
            sum += g;
        }
        double avarage = sum/grades.size();
        System.out.println("Avarage Grade Is : " + avarage);
    }

    public void getHighestgrade(){
        if(grades.isEmpty()){
            System.out.println("There Is No Grades!");
            return;
        }
        double highest = grades.get(0);
        for(double g : grades){
            if(g > highest){
                highest = g;
            }
        }
        System.out.println("Highest Grade Is: " + highest);
    }

    public void getLoestGrade(){
        if(grades.isEmpty()){
            System.out.println("There Is No Grades!");
            return;
        }
        double lowest = grades.get(0);
        for(double g : grades){
            if(g < lowest){
                lowest = g;
            }
        }
        System.out.println("Highest Grade Is: " + lowest);
    }

    public void getLettergrade(){}

    public void getStudentInfo(){}



    
}
