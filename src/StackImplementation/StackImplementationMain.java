package StackImplementation;

public class StackImplementationMain {
    public static void main(String[] args) {
        StackUtil stack1 = new StackUtil();
        stack1.push(4);
        stack1.push(5);
        System.out.println(stack1.integers);
        stack1.pop();
        System.out.println(stack1.integers);
    }
}
