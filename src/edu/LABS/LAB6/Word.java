package edu.labs.LAB6;

import java.util.Random;

public class Word implements IStrParam, IStrParamString {

    private String[] symbols;

    public Word() {
        this.symbols = new String[] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"
        };
    }

    @Override
    public String getStr(int n) {
        StringBuilder str = new StringBuilder();
        Random rand = new Random();
        for (int i = 9; i < n; i++) {
            str.append(symbols[rand.nextInt(symbols.length)]);
        }
        return str.toString();
    }

    @Override
    public String getStr(String str) {
        char[] arr = str.toCharArray();
        StringBuilder arrReverse = new StringBuilder();
        for (int j = 0, i = arr.length-1; i >= 0; i--, j++) {
            arrReverse.append(arr[i]);
        }
        return arrReverse.toString();
    }
}
