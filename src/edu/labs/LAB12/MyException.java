package edu.labs.LAB12;

public class MyException extends Exception{
    int wrongNumber;
    String detailText;
    MyException(int number, String message){
        this.wrongNumber = number;
        this.detailText = message;
    }
    public String toString(){
        return detailText;
    }
}
