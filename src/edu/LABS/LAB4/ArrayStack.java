package edu.labs.LAB4;

public class ArrayStack implements Stack {

    private static final int DEFAULT_SIZE = 10;
    private Integer[] arrayStack;

    public ArrayStack() {
        arrayStack = new Integer[DEFAULT_SIZE];
    }

    public ArrayStack(int size) {
        arrayStack = new Integer[size];
    }

    @Override
    public void push(int data) {
        for (int i = 0; i < arrayStack.length; i++) {
            if (arrayStack[i] == null && i <= arrayStack.length - 1) {
                arrayStack[i] = data;
                break;
            }
        }

        /*Integer[] arr = Arrays.copyOf(arrayStack, arrayStack.length);
        arr[arrayStack.length] = data;
        arrayStack = arr;*/
    }

    @Override
    public int pop() {
        int data = 0;
        for (int i = arrayStack.length - 1; i >= 0; i--) {
            if (arrayStack[i] != null) {
                data = arrayStack[i];
                arrayStack[i] = null;
                break;
            }
        }
        return data;
    }

    @Override
    public int size() {
        return arrayStack.length;
    }

    public int realSize() {
        int c = 0;
        for (int i = 0; i < arrayStack.length; i++) {
            if (arrayStack[i] != null) {
                c++;
            }
        }
        return c;
    }

    @Override
    public boolean isEmpty() {
        if (arrayStack[0] == null) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < arrayStack.length; i++) {
            arrayStack[i] = null;
        }
    }

    public void show() {
        for (int i = 0; i < arrayStack.length; i++) {
            System.out.println(arrayStack[i]);
        }
    }
}