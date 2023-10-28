package Homework3;

public class PhoneNumberException extends NumberFormatException{
    PhoneNumberException () {
        super("Phone number supposed to include 11 digits");
    }

}
