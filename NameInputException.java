package Homework3;

public class NameInputException extends NumberFormatException{
    NameInputException () {
        super("Name supposed to include only symbols.");
    }
}
