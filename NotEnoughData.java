package Homework3;

public class NotEnoughData extends Exception {
    NotEnoughData () {
        super("You haven't input enough information.");
    }
}
