
package com.ga.lab;

public class ExpressionBalancing {

    public static boolean isBalanced(String expression) {

        SingleArrayStack stack = new SingleArrayStack(expression.length());

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);

            }
            else if (ch == ')' || ch == ']' || ch == '}' ) {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if ((open == '(' && ch != ')') || (open == '[' && ch != ']') || (open == '{' && ch != '}')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String expression = "{[()]}";

        System.out.println(isBalanced(expression));
    }
}
