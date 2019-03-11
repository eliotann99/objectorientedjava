/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectorientedjava;


class Component {
    int year;
    String name;
    double comunicationSpeed;
    String comunicationSpeedUnit;
    String creator;
    String description;
    
}// close component class


class ComputerComponent extends Component {
    double price;
    double currentPrice;
    
    public double setPrice(double a) {
        price= a;
        getPrice();
        return currentPrice;
    }//close setPrice
    
    private void getPrice() {
        currentPrice= price - (price * .25);
    }// close getPrice
    
}// close ComputerComponent

class HumanInterestComponent extends Component {
    double netWorth;
    String netWorthUnit;
    int age;
    
    public int setage(int currentyear){
    age = currentyear - year;
    return age;
    }//close get age
}// clsoe humaninterestcomponent

public class TimelineNonExample {
    public static void main(String[] args) {
    HumanInterestComponent trump = new HumanInterestComponent();
    trump.name = "Donald Trump";
    trump.year= 1946;
    trump.age= trump.setage(2019);
    trump.comunicationSpeed= 100.17;
    trump.comunicationSpeedUnit= "words per minute";
    trump.creator="the one and only, God";
    trump.description= "red hair";
    trump.netWorth=3.1;
    trump.netWorthUnit= "Billions";
    displayHumanIntrest(trump);
    
    ComputerComponent pentiumII= new ComputerComponent();
    pentiumII.year = 1997;
    pentiumII.name= "Pentium 2";
    pentiumII.comunicationSpeed=66;
    pentiumII.comunicationSpeedUnit= "MHz";
    pentiumII.creator="intel";
    pentiumII.description="Cpu Chip";
    pentiumII.price= pentiumII.setPrice(453);
    displayComputerComponent(pentiumII);
    

    }// close main method
    static void displayHumanIntrest(HumanInterestComponent a) {
        System.out.println(a.name);
        System.out.println("is " + a.age + " old");
        System.out.println("was born in " +a.year);
        System.out.println("can say around " + a.comunicationSpeed +" " + a.comunicationSpeedUnit);
        System.out.println("was Created by " + a.creator);
        System.out.println("known as "+ a.description);
        System.out.println("has a net worth of "+ a.netWorth +" "+ a.netWorthUnit + "\n");
    }// close displayHumanIntrest

    static void displayComputerComponent(ComputerComponent a) {
        System.out.println(a.name);
        System.out.println("was made in " + a.description);
        System.out.println("created by " + a.creator +" in the year "+ a.year);
        System.out.println("has a speed of " + a.comunicationSpeed + " " + a.comunicationSpeedUnit);
        System.out.println("when it was launched it had the price of $" + a.price );
        System.out.println("and it's current price is $" +a.currentPrice +"\n");
    }// close diplaycomputerComponent


}// close TimelineNonExample
