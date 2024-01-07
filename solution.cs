using System;
using System.Linq;

public class Program
{
    public static void Main()
    {
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        int jumps = MinJumps(arr, arr.Length);
    }
}