package Stack;

public class StackP {

    private int top;
    private int[] arr;
    private int capacity;

    // Default Constructor with fixed size
    public StackP() {
        this(1000); // Default size is 1000
    }

    // Constructor with custom capacity
    public StackP(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    // Push method to add an element to the stack
    public void push(int data) {
        if (top == capacity - 1) {
            // Resize the stack dynamically
            resize();
        }
        arr[++top] = data;
    }

    // Pop method to remove and return the top element of the stack
    public int pop() {
        if (top < 0) {
            throw new IllegalStateException("Stack underflow: No elements to pop");
        }
        return arr[top--];
    }

    // Print all elements in the stack
    public void print() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    // Resize the array when capacity is reached
    private void resize() {
        int newCapacity = capacity * 2;
        int[] newArr = new int[newCapacity];
        System.arraycopy(arr, 0, newArr, 0, capacity);
        arr = newArr;
        capacity = newCapacity;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check the size of the stack
    public int size() {
        return top + 1;
    }

    // Peek method to view the top element without removing it
    public int peek() {
        if (top < 0) {
            throw new IllegalStateException("Stack is empty: No elements to peek");
        }
        return arr[top];
    }
}
