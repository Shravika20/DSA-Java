import java.util.Scanner;
public class PushPopStack {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;
    public void push(int value) {
        if(top == max - 1)
            System.out.println("Stack Overflow");
        else
            stack[++top] = value;
    }
    public void pop() {
        if(top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Deleted Element = " + stack[top--]);
    }
    public void display() {
        if(top == -1) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Stack:");
        for(int i = top; i >= 0; i--)
            System.out.println(stack[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PushPopStack s = new PushPopStack();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            s.push(sc.nextInt());
        }
        s.pop();
        s.display();
        sc.close();
    }
}