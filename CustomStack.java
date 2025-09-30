package Com.kavita.Stack;

public class CustomStack {
        private int[] data;
        private static final int DEFAULT_SIZE = 10;
        private int top = -1;

        // Constructor with default size
        public CustomStack() {
            this(DEFAULT_SIZE);
        }

        // Constructor with custom size
        public CustomStack(int size) {
            data = new int[size];
        }

        // Push element onto stack
        public boolean push(int value) {
            if (isFull()) {
                System.out.println("Stack is full!");
                return false;
            }
            data[++top] = value;
            return true;
        }

        // Pop element from stack
        public int pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("Cannot pop from empty stack!");
            }
            return data[top--];
        }

        // Peek at top element
        public int peek() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is empty!");
            }
            return data[top];
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Check if stack is full
        public boolean isFull() {
            return top == data.length - 1;
        }
    }

