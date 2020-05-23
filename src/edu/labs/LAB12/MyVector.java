package edu.labs.LAB12;

public class MyVector {
    private static final int CAPACITY = 10;
    private int[] vector;
    private int current;

    public MyVector(){
        vector = new int[CAPACITY];
        current=0;
    }
    public int get(int index) throws IndexOutOfBounds,NoSuchElement{
        if (index<0 || index>CAPACITY){
            throw new IndexOutOfBounds(101,"Index out of bounds in get().");
        }
        if (index>current){
            throw new NoSuchElement(301,"No such element in get().");
        }
        return vector[index];
    }

    int size(){
        return this.current;
    }

    void addToEach(int value){
        for (int i = 0; i<current; i++) vector[i] += value;
    }

    void multiplyEachBy(int value)throws IndexOutOfBounds{
        if (value==0){
            throw new IndexOutOfBounds(102,"Can't multiply by 0 in multiplyEachBy().");
        }
        for (int i = 0; i<current; i++) vector[i] *= value;
    }

    public void put(int... values) throws Overflow {
        for (int v : values){
            if (current+1>CAPACITY){
                throw new Overflow(202,"Vector overflow during put().");
            }
            vector[current] = v;
            current++;
        }
    }

    void union(MyVector vector)throws Overflow{
        if (current+vector.current>CAPACITY){
            throw new Overflow(201,"Vector overflow during union().");
        }
        for (int i = 0; i<vector.current; i++){
            this.put(vector.vector[i]);
        }
    }

    boolean equal(MyVector vector){
        for (int i = 0; i<current;i++){
            if(this.vector[i]!=vector.vector[i] || current!=vector.current){
                return false;
            }
        }
        return true;
    }

    MyVector intersect(MyVector vector){
        MyVector temp = new MyVector();
        for(int i = 0;i<current;i++){
            for (int j=0;j<vector.current;j++){
                if (this.vector[i]==vector.vector[j]){
                    temp.vector[i] = this.vector[i];
                    temp.current++;
                }
            }
        }
        return temp;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<current; i++){
            stringBuilder.append("v[");
            stringBuilder.append(i);
            stringBuilder.append("]=");
            stringBuilder.append(vector[i]);
            stringBuilder.append("; ");
        }
        return stringBuilder.toString();
    }

}
