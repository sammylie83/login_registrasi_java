/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Backend Dev
 */
public class ValidationsEmail {
    private Pattern regexPattern;
    private Matcher regMatcher;

    public String validateEmailAddress(String emailAddress) {

        regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        regMatcher   = regexPattern.matcher(emailAddress);
        if(regMatcher.matches()) {
            return "Valid Email Address";
        } else {
            return "Invalid Email Address";
        }
    }

    public static void main(String[] args) {

        String emailAddress = "sammylie83@gmail.com";

        ValidationsEmail validations = new ValidationsEmail();
        System.out.println(validations.validateEmailAddress(emailAddress));

    }
}
