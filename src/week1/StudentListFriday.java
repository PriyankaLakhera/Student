/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author pc
 */
public class StudentListFriday {
    public static void main(String[] args) 
    {
       Student[] students = new Student[5];
       students[0] = new Student("Gabe");
       students[1] = new Student("Pranav");
       students[2] = new Student("Muhammad");
       students[3] = new Student("Lucas");
       students[4] = new Student("Chris");
       //Student s1 = new Student("Liz");
       //students[0] = s1;
       for(Student s: students)
       {
           System.out.println(s.getName());
       }
    }
    
}
