public class IsEmptyStack {
    int top = -1;
    public void isEmpty() {
        if(top == -1)
            System.out.println("Stack is Empty");

        else
            System.out.println("Stack is Not Empty");
    }
    public static void main(String[] args) {
        IsEmptyStack s = new IsEmptyStack();
        s.isEmpty();
    }
}