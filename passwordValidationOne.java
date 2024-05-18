/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JOptionPane;

/**
 *
 * @author Lie Samsudin
 */
public class passwordValidationOne {
     public static void main(String[] args) {
        String pass = "12345678";
        System.out.println(valPassword(pass));
    }
    public static boolean valPassword(String password){
        if (password.length()>7){
            if (checkPass(password)){
                JOptionPane.showMessageDialog(null, "checkPass Successfully ");
                return true;
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Password must be at least 6 characters containing a combination of letters"
                        + " and numbers, and have at least 1 capital letter ");
                return false;
            }
        }
        else{
            System.out.println("Too Small");
            return false;
        }
    }
    public static boolean checkPass(String password){
        boolean hasNum =false; //check if password has a number
        boolean hasCap =false; //check if password has uppercase character
        boolean hasLow =false; //check if password has lowercase characters
        char c; // used to check every single character in the password

        //loop for every single character in a string
        for (int i =0; i<password.length(); i++ ){
            //assign c to the character we are looking for
            c = password.charAt(i);
            if (Character.isDigit(c)){
                hasNum = true;
            } else if (Character.isUpperCase(c)) {
                hasCap = true;
            } else if (Character.isLowerCase(c)) {
                hasLow = true;
            }
            // check if all the three boolean variables are true
            if (hasNum && hasCap && hasLow){
                return true;
            }
        }
       return  false;

    }
}
