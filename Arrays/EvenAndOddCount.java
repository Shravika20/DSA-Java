import java.util.Scanner;
public class EvenAndOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("\nEven Elements: " + evenCount);
        System.out.println("Odd Elements: " + oddCount);
        sc.close();
    }
}