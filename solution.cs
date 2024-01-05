```C#
using System;
using System.Linq;

public class Program
{
    public static void Main()
    {
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        int jumps = MinJumps(arr, arr.Length);
        Console.WriteLine(jumps);
    }

    static int MinJumps(int[] arr, int n)
    {
        if (n <= 1)
            return 0;
        if (arr[0] == 0)
            return -1;
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        for (int i = 1; i < n; i++)
        {
            if (i == n - 1)
                return jump;
            maxReach = Math.Max(maxReach, i + arr[i]);
            step--;
            if (step == 0)
            {
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