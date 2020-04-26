package edu.labs.LAB4;

import java.util.ArrayList;

public class ListStack implements Stack {
    private ArrayList<Integer> listStack;

    public ListStack() {
        listStack = new ArrayList<>();
    }

    @Override
    public void push(int data) {
        listStack.add(data);
    }

    @Override
    public int pop() {
        int data = listStack.get(listStack.size()-1);
        listStack.remove(listStack.size()-1);
        return data;
    }

    @Override
    public int size() {
        return listStack.size();
    }

    @Override
    public boolean isEmpty() {
        if (listStack.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
            listStack.clear();
        }

    public void show() {
        for (int i = 0; i < listStack.size(); i++) {
            System.out.println(listStack.get(i));
        }
    }
}
