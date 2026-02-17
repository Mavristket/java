// Interface
interface Stack {
    int size = 5;   // stack size

    void push(int value);
    void pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// Implementing class
class IntegerStack implements Stack {

    int arr[] = new int[size];
    int top = -1;

    public void push(int value) {
        if (overflow()) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
        }
    }

    public void pop() {
        if (underflow()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + arr[top--]);
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// Test class
public class Main {
    public static void main(String[] args) {

        IntegerStack s = new IntegerStack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.display();
    }
}
