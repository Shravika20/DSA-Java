import java.util.Scanner;
public class StackImplementation {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;
    public void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImplementation s = new StackImplementation();
        System.out.print("Enter number of elements (Maximum 5): ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            s.push(sc.nextInt());
        }
        s.display();
        sc.close();
    }
}