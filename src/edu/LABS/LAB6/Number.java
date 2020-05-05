package edu.labs.LAB6;

public class Number implements IStr, IStrParam {
    private int randomNumber;
    private String[] numbers;

    public Number(int randomNumber) {
        this.randomNumber = randomNumber;
        this.numbers = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    }

    @Override
    public String getStr() {
        return String.valueOf(this.randomNumber);
    }

    @Override
    public String getStr(int n) {
        return this.numbers[n];
    }
}
