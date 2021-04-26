package main.java;

public class ClassB {
    private int start = 0;

    public int next() {
        return start++;
    }

    public void reset() {
        this.start = 0;
    }
}
