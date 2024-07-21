public class circular {

    static class CQueue {
        static int size;
        static int front = -1;
        static int rear = -1;
        static int[] arr;

        CQueue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void push(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = arr[front];
            if (front == rear) {
                // Queue is now empty
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return data;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        System.out.println("Circular queue using array");

        CQueue q = new CQueue(4);

        q.push(1);
        q.push(2);
        q.push(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}
