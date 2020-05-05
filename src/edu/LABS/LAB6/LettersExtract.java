package edu.labs.LAB6;

public class LettersExtract implements IStrParamString {
    @Override
    public String getStr(String str) {
        char[] arr = str.toCharArray();
        StringBuilder noDigits = new StringBuilder();
        for (char c : arr) {
            if (!Character.isDigit(c)) {
                noDigits.append(c);
            }
        }
        return noDigits.toString();
    }
}
