import java.util.Scanner;
public class queue_2 {
    static int[] queue_arr = new int[50];
    static int front = 0;
    static int rear = -1;
    static int max;
    static Scanner sc = new Scanner(System.in);

    queue_2() {

    }

    queue_2(int x) {

    }

    public static int isFull() {
        if (front == 0 && rear == max - 1) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int isEmpty() {
        if (rear < front)
            return 1;
        else {
            return -1;
        }
    }

    public static void enqueue(int x) {
        if ((isFull() == 1)) {
            System.out.printf("!! Warning Queue Overflow detected !!\n");
        } else {
            rear = rear + 1;
            queue_arr[rear] = x;
        }

    }

    public static void dequeue() {
        if ((isEmpty() == 1)) {
            System.out.printf("!! Warning Queue Underflow detected !!\n");
        } else {
            System.out.printf("Element deleted from queue is : %d\n", queue_arr[front]);
            front = front + 1;
        }

    }

    public static void display() {
        int front_pos = front, rear_pos = rear;
        if (rear < front) {
            System.out.printf("Queue is empty\n");
            return;
        }
        System.out.printf("Queue elements :\n");
        if (front_pos <= rear_pos)
            while (front_pos <= rear_pos) {
                System.out.printf("%d ", queue_arr[front_pos]);
                front_pos++;
            }
        else {
            while (front_pos <= max - 1) {
                System.out.printf("%d ", queue_arr[front_pos]);
                front_pos++;
            }
            front_pos = 0;
            while (front_pos <= rear_pos) {
                System.out.printf("%d ", queue_arr[front_pos]);
                front_pos++;
            }
        }
        System.out.printf("\n");

    }

    public static void main(String[] args) {
        int item, n;
        System.out.printf("Expected MAX Size of the array --> ");
        max = sc.nextInt();
        do
    {
        System.out.printf("\n\t\tMENU\n");
        System.out.printf("---------------------------------------\n");
        System.out.printf("1.Insert\n");
        System.out.printf("2.Delete\n");
        System.out.printf("3.Display\n");
        System.out.printf("4.Quit\n");
        System.out.printf("---------------------------------------\n");
        System.out.printf("Enter a choice (1,2,3,4) --> ");
        n = sc.nextInt();
        System.out.printf("---------------------------------------\n");
        switch (n)
        {
        case 1:
            System.out.printf("Input the element for insertion in queue : ");
            item = sc.nextInt();
            enqueue(item);
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
            break;
        case 4:
        System.out.println("Program Terminated");
            break;
        default:
            System.out.printf("Wrong choice\n");
        }
    } while (n != 4);


    }
}
