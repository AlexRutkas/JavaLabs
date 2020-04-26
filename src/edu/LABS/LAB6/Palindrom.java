package edu.labs.LAB6;

public class Palindrom implements IStrParamString {
    @Override
    public String getStr(String str) {
        char[] arr = str.toCharArray();
        StringBuilder arrReverse = new StringBuilder();
        for (int j = 0, i = arr.length-1; i >= 0; i--, j++) {
            arrReverse.append(arr[i]);
        }
        if (arrReverse.toString().toLowerCase().equals(str.toLowerCase())) {
            return "Palindrom";
        }
        return "No palindrom";
    }
}
