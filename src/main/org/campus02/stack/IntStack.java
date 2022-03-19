package org.campus02.stack;

import org.campus02.stack.exceptions.StackEmptyException;
import org.campus02.stack.exceptions.StackFullException;

import java.util.Arrays;

public class IntStack {
    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) throws StackFullException {
        if (this.pointer == this.stack.length - 1)
            throw new StackFullException("Maximum size reached!");
        stack[++pointer] = value;
    }

    public int pop() throws StackEmptyException {
        if(this.pointer == -1)
            throw new StackEmptyException("Stack is empty!");
        int value = stack[pointer];
        stack[pointer--] = 0;
        return value;
    }

    @Override
    public String toString() {
        return "IntStack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
