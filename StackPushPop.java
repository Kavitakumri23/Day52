package Com.kavita.Stack;
import java.util.Stack;

public class StackPushPop {


//    InBuiltExamples

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // Pushing elements
            stack.push(34);
            stack.push(45);
            stack.push(2);
            stack.push(9);
            stack.push(18);

            // Popping elements and printing
            System.out.println("Popped: " + stack.pop()); // removes 18
            System.out.println("Popped: " + stack.pop()); // removes 9
            System.out.println("Popped: " + stack.pop()); // removes 2
            System.out.println("Popped: " + stack.pop()); // removes 45
            System.out.println("Popped: " + stack.pop()); // removes 34
        }
    }

