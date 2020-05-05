package edu.labs.LAB6;

public class Week implements IStr {
    private int dayOfWeek;
    private String[] days;

    public Week(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        this.days = new String[]{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }


    @Override
    public String getStr() {
        return String.valueOf(this.days[this.dayOfWeek-1]);
    }
}
