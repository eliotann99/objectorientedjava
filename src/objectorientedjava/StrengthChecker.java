/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedjava;

/**
 *
 * @author eliot
 */
public class StrengthChecker {
    private int maxLength;
    private int minLength;
    private String[] reqSymbols;
    private String userPass;
    boolean[] tf;
    
    public boolean checkPassword(String a) {
        userPass=a;
        boolean b= false;
        if ( userPass.length() < minLength) {
           System.out.println("The Passwored you have chosen is too short");
           return b;
        } else if (userPass.length() > maxLength){ 
           System.out.println("The password you have chosen is too long");
           return b;
        } else {
           System.out.println("The password you have chosen matches the length requirements");
        }// close if/else statement
        
        tf= new boolean[reqSymbols.length];
        
        for (int s = 0; s<reqSymbols.length; s++) {
            String t = reqSymbols[s];
            tf[s]= userPass.contains(t);
        }// close for loop
        
        for ( int u =0; u<tf.length; u++ ) {
            if (tf[u]== false) {
                System.out.println("but, your password is weak. try using the required symbols");
                break;
            } else {
                b=!b;
            }
            
        }  // close second for loop  
        
        return b ;
    } // close checkPassword

    public void setReqCharacter(String[] a) {
        // it is moving data from string[] a that was passed from the client 
        // class to the reqSymbols[]
        reqSymbols= a;
      }// close reqCharacter
    
    public void setLength(int min , int max){
        minLength= min;
        maxLength= max;
        
    }// close setLenght class
}// close class