/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedjava;
import java.util.Scanner;
/**
 *
 * @author eliot
 */
public class SecureLand {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter your password");
        System.out.println("try using the following symbols for a stronger password.");
        StrengthChecker get= new StrengthChecker();
        get.setLength(8, 20);
        String r[]= new String[3];
        r[0]="@";
        r[1]="!";
        r[2]="$";
        for (int i=0; i<r.length; i++) {
            System.out.println(r[i]);
        }// close for loop
        String pass= userInput.next();
        get.setReqCharacter(r);
        boolean f =get.checkPassword(pass);
        if (f== true){
            System.out.println("perfect, your password is strong");
        }// close if
    }//close main method 
}// close class