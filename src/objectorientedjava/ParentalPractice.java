/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedjava;
import java.util.ArrayList;

class Student {
    String name;
    int studID;
    String gender;
    int age;
    String stat;
}// close student class


class ElemStudent extends Student{
    String allergies;
    int emergencyContactPhone;
    
}// close elemstudent

class HighSchoolStudent extends Student{
    int satScores;
    String email;
    double gpaScore;
    
    
    public void highLife() {
        
    }// close high life method
}// close highschool students class

class CollegeStudent extends HighSchoolStudent {
    boolean LivesOnCampus;
    String dormNumber;
    
    
}// close college student class

public class ParentalPractice {

   
    public static void main(String[] args) {
        ElemStudent stud1= new ElemStudent();
        stud1.name="Ethan";
        stud1.age=11;
        stud1.gender="male";
        stud1.allergies="penut butter";
        stud1.emergencyContactPhone= 412539;
        stud1.stat=" is in Elementry School";
        displayElemStud(stud1);

        ElemStudent stud2= new ElemStudent();
        stud2.name= "Kayla";
        stud2.age= 10;
        stud2.gender="female";
        stud2.allergies="no allergies.";
        stud2.emergencyContactPhone= 412555;
        stud2.stat=" is in Elementry School";
        displayElemStud(stud2);
        
        HighSchoolStudent stud3= new HighSchoolStudent();
        stud3.name="Isy";
        stud3.age=17;
        stud3.gender="female";
        stud3.studID=1362255;
        stud3.satScores=1530;
        stud3.email="Isy@gmail.com";
        stud3.gpaScore=3.8;
        stud3.stat=" is in Highschool";
        displayHiscStud(stud3);
        
        
        HighSchoolStudent stud4= new HighSchoolStudent();
        stud4.name="Collin";
        stud4.age=16;
        stud4.gender="male";
        stud4.studID=1364935;
        stud4.satScores=1490;
        stud4.email="Collin@gmail.com";
        stud4.gpaScore=3.6;
        stud4.stat=" is in Highschool";
        displayHiscStud(stud4);
        
        CollegeStudent stud5= new CollegeStudent();
        stud5.name="Nelson";
        stud5.age=20;
        stud5.gender="male";
        stud5.studID=1273927;
        stud5.LivesOnCampus=true;
        stud5.dormNumber= "4635 eaden hall";
        stud5.email= "nel@gmail.com";
        stud5.gpaScore=4.0;
        stud5.stat=" is in College";
        displayCollegeStud(stud5);
        
        CollegeStudent stud6= new CollegeStudent();
        stud6.name="Morgan";
        stud6.age=21;
        stud6.gender="female";
        stud6.studID=1469717;
        stud6.LivesOnCampus=false;
        stud6.dormNumber= "DNE";
        stud6.email="morgan11@gmail.com";
        stud6.gpaScore= 3.6;
        stud6.stat=" is in College";
        displayCollegeStud(stud6);
        
        ArrayList<Student> studList = new ArrayList<>();
        studList.add(stud1);
        studList.add(stud2);
        studList.add(stud3);
        studList.add(stud4);
        studList.add(stud5);
        studList.add(stud6);
        
        for (int i=0; i<studList.size(); i++) {
                System.out.println("is " + studList.get(i).name + " in College?" );
            if (studList.get(i) instanceof CollegeStudent) {
                System.out.println(studList.get(i).name +  studList.get(i).stat );
            } else {
                System.out.println("No " + studList.get(i).name  + studList.get(i).stat);
            }
        }// close for statement
        
        Student stud= new Student();
        ElemStudent elemStud= new ElemStudent();
        elemStud.name= "Et";
        elemStud.allergies="email, hw, peanut, math";
        elemStud.emergencyContactPhone = 1111111111;
        /* I can store a subclass in a variablle typed to the superclass!
        Handy because I can write code that operates on the superclass before
        the subclass has even been written
        */
        HighSchoolStudent hisc= new HighSchoolStudent();
        stud=elemStud;
        ElemStudent anotherElemStudVar;
        anotherElemStudVar= (ElemStudent) stud;
        
        Object o= stud1;
        boolean result = o instanceof HighSchoolStudent;
            System.out.println(result);
    }//close main method
    
     static void displayElemStud(ElemStudent a) {
        System.out.println("Student name: "+ a.name);
        System.out.println("Student age: "+ a.age);
        System.out.println("Student gender: "+ a.gender);
        System.out.println("Student allergies: "+ a.allergies);
        System.out.println("Student Emergency Contact: "+ a.emergencyContactPhone);

    }// close displayElemStud
    
     static void displayHiscStud(HighSchoolStudent a) {
        System.out.println("Studnet name: " +a.name);
        System.out.println("Student age: " +a.age);
        System.out.println("Studnet gender: " + a.gender);
        System.out.println("Student IDnubmer: " + a.studID);
        System.out.println("Student SAT Score: "+ a.satScores);
        System.out.println("Student email: " + a.email);
        System.out.println("Student GPA: " + a.gpaScore);
    }// close displayHiscStud
    
     static void displayCollegeStud(CollegeStudent a) {
        System.out.println("Studnet name: " + a.name );
        System.out.println("Student age: "+ a.age);
        System.out.println("Studnet gender: "+ a.gender);
        System.out.println("Student IDnubmer: "+ a.studID);
        System.out.println("Student email: "+ a.email);
        System.out.println("Student GPA: "+ a.gpaScore);
        System.out.println("Student dorm number if they live on campus: "+ a.LivesOnCampus);
    }// close dispalyCollegeStud
}
