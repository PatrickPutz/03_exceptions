package main.org.campus02.stack;


public class IntStackDemo {
    public static void main(String[] args) {

        try {
            org.campus02.stack.IntStack stack = new org.campus02.stack.IntStack(2);

            //stack.pop();

            System.out.println("push = " + 1);
            stack.push(1);
            System.out.println("stack = " + stack);

            int pop = stack.pop();
            System.out.println("pop = " + pop);
            System.out.println("stack = " + stack);

            System.out.println("push = " + 2);
            stack.push(2);
            System.out.println("stack = " + stack);

            //stack.push(3);
            //stack.push(4);
        } catch (org.campus02.stack.exceptions.StackFullException e) {
            e.printStackTrace();
            System.out.println("no more space dude");
        } catch (org.campus02.stack.exceptions.StackEmptyException e) {
            e.printStackTrace();
            System.out.println("seems a bit empty to me");
        } finally {
            System.out.println("cleaned up");
        }

    }
}
