Here is a Java console application that solves the problem:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Minimum number of jumps to reach end is " + minJumps(array, length));
    }

    static int minJumps(int arr[], int n) {
        if (n <= 1)
            return 0;
        if (arr[0] == 0)
            return -1;
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jump;
            maxReach = Math.max(maxReach, i + arr[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxReach)
                    return -1;
                step = maxReach - i;
            }
        }
        return -1;
    }
}
```

This console application first asks the user to input the length of the array and then the elements of the array. It then calculates the minimum number of jumps needed to reach the end of the array using the `minJumps` method and prints the result. The `minJumps` method uses a greedy algorithm to find the minimum number of jumps.