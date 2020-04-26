package edu.labs.LAB4;

public class Main {

    public static void main(String[] args) {
        /*
        ArrayStack stack = new ArrayStack(3);

        System.out.println("Количество: " + stack.realSize());

        if (stack.realSize() == 0)

        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println("Количество: " + stack.realSize());
        System.out.println("Удалённый элемент: " + stack.pop());
        System.out.println("Количество: " + stack.realSize());
        stack.clear();
        System.out.println("Количество: " + stack.realSize());
        //stack.show();
        */
        ListStack listStack = new ListStack();
        System.out.println("Количество: " + listStack.size());
        listStack.push(5);
        listStack.push(7);
        if (listStack.isEmpty()) {
            System.out.println("Стэк пустой!");
        } else {
            System.out.println("Количество: " + listStack.size());
        }
        listStack.clear();
        if (listStack.isEmpty()) {
            System.out.println("Стэк пустой!");
        } else {
            System.out.println("Количество: " + listStack.size());
        }
    }
}
