package Homework3;

public class GenderException extends Exception{
    GenderException (){
        super("Gender can be only 'm' or 'f'");
    }
}
