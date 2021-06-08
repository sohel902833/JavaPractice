package Test;

import java.util.Scanner;
import java.util.Stack;

class Parser{
    public  boolean isBalanced(String expression) {

        Stack<Character> openBrackets = new Stack<Character>();

        for( Character c : expression.toCharArray()) {
            if (isOpen(c)) {
                openBrackets.push(c);
            } else if(openBrackets.isEmpty()) {
                return false;
            } else {
                Character open = openBrackets.pop();

                if (!isPair(open,c)) {
                    return false;
                }
            }
        }

        if (openBrackets.size() > 0) {
            return false;
        }
        return true;
    }

    private static boolean isOpen(Character c) {
        return c != null && (c.equals('(') || c.equals('[') || c.equals('{'));
    }

    private static boolean isPair(Character open, Character close) {
        if (open == null || close == null) {
            return false;
        } else if (open.equals('(') && close.equals(')')) {
            return true;
        } else if (open.equals('[') && close.equals(']')) {
            return true;
        } else if (open.equals('{') && close.equals('}')) {
            return true;
        } else {
            return false;
        }
    }
}



class Solution {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}
