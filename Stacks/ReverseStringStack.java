import java.util.Scanner;
import java.util.Stack;
public class ReverseStringStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        for(char ch : str.toCharArray()) {
            stack.push(ch);
        }
        System.out.print("Reversed String: ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        sc.close();
    }
}