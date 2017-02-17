package ds.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by rc_chandan on 17/02/17.
 */
public class Stack<E> {
    private int maxSize;
    private E[] stackValues;
    private int top;

    public Stack (Class<E> c, int maxSize) {
        this.maxSize = maxSize;
        this.stackValues = (E[]) Array.newInstance(c, maxSize);
        this.top = -1;
    }

    public void push(E value) {
        if(isFull()) {
            System.out.println("Stack is already full");
        }
        else {
            top++;
            stackValues[top] = value;
        }
    }

    public E pop() {
        if(isEmpty()) {
            System.out.println("Stack is already empty");
            return null;
        }
        else {
            int oldTop = top;
            top--;
            return stackValues[oldTop];
        }
    }

    public E peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        else {
            return stackValues[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "maxSize=" + maxSize +
                ", stackValues=" + Arrays.toString(stackValues) +
                ", top=" + top +
                '}';
    }
}
