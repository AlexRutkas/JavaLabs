package edu.labs.LAB4;
/*
import labs.InStack;

import java.util.Arrays;

public abstract class SimpleStack implements InStack<Integer> {
    private static final int DEFAULT_SIZE = 10;
    private static final String LS = System.lineSeparator();
    private final String nameStack;
    private StringBuilder sb = new StringBuilder();

    private Integer[] stackArray;
    private int size;

    SimpleStack(String nameStack) {
        this(null, nameStack);
    }

    SimpleStack(Integer[] values, String nameStack) {
        this.nameStack = nameStack;
        this.stackArray = new Integer[DEFAULT_SIZE];
        addAll(values);
        System.out.printf("Сформирован стек %s:%s%s%s", nameStack, LS, toString(), LS);

    }

    private void increaseLength() {
        if (this.size == this.stackArray.length) {
            this.stackArray = Arrays.copyOf(this.stackArray, this.stackArray.length * 3 >> 1 + 1);
        }
    }

    private void addAll(Integer[] values) {
        if (values != null && values.length > 0) {
            for (Integer value : values) {
                push(value);
            }
        }
    }

    @Override
    public boolean empty() {
        System.out.printf("Проверка стека %s на пустоту:%s%s%s", nameStack, LS, this.size == 0 ? "Стэк пустой" : "Стэк не пустой", LS);
        return this.size == 0;
    }
}
*/