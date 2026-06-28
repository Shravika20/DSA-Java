import java.util.Scanner;
public class PeekStack {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;
    public void push(int value) {
        if(top != max - 1)
            stack[++top] = value;
    }
    public void peek() {
        if(top == -1)
            System.out.println("Stack Empty");
        else
            System.out.println("Top Element = " + stack[top]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeekStack s = new PeekStack();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            s.push(sc.nextInt());
        }
        s.peek();
        sc.close();
    }
}