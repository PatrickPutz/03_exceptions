package main.org.campus02.stack;

import org.campus02.stack.IntStack;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class IntStackTest {

    private org.campus02.stack.IntStack stack;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        stack = new IntStack(2);
    }

    @org.junit.jupiter.api.Test
    void pushWithException() {
        Assertions.assertThrows(org.campus02.stack.exceptions.StackFullException.class,() -> {
            stack.push(1);
            stack.push(1);
            stack.push(1);
            stack.push(1);
            stack.push(1);
        });

        //assertEquals(org.campus02.stack.exceptions.StackFullException.getMessage(), "Maximum size reached!");
    }
}