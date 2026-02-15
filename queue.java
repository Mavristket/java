class Queue {
    int max = 5;
    int[] arr = new int[max];
    int front = 0;
    int rear = -1;
    int count = 0;

    // Enqueue operation
    void enqueue(int data) {
        if (count == max) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            arr[rear] = data;
            count++;
            System.out.println(data + " inserted into queue");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(arr[front] + " removed from queue");
            front++;
            count--;
        }
    }

    // Peek operation
    void peek() {
        if (count == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + arr[front]);
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.peek();
        q.dequeue();
        q.peek();
    }
}
