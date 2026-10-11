package com.ga.lab;
import java.util.*;
public class StackReversal {
    public static Stack<Integer> reverseStack2Stacks(Stack<Integer> stack){
        Stack<Integer> tempstack1 = new Stack<>();

        while (!stack.isEmpty()) {
            tempstack1.push(stack.pop());
        }
        return tempstack1;
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,top);

    }

    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()){
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }


    public static void main(String[] args) {
    Stack<Integer> stack1 = new Stack<>();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        System.out.println("====Using 2 Stacks:====");
        System.out.println("Original: " + stack1);
        System.out.println("Reversed: " +reverseStack2Stacks(stack1));
        System.out.println();
        System.out.println("====Using Recursion:====");

        Stack<Integer> stack2 = new Stack<>();

        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.push(40);
        System.out.println("Original: " + stack2);

        reverseStack(stack2);
        System.out.println("Reversed: " + stack2);
}
}
