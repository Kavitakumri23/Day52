package Com.kavita.Stack;

public class DynamicStack {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int top = -1;

    // Constructor with default size
    public DynamicStack() {
        this(DEFAULT_SIZE);
    }

    // Constructor with custom size
    public DynamicStack(int size) {
        data = new int[size];
    }

    // Push element onto stack
    public boolean push(int value) {
        if (isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
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

    // Size of stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Now stack is full, next push will double size
        stack.push(40);
        stack.push(50);

        System.out.println("Stack size: " + stack.size());

        // Pop some elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }
}

