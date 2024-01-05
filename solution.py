Here is a Python console application that solves the problem:

```python
def min_jumps(arr, n):
    jumps = [0 for i in range(n)]
 
    if (n == 0) or (arr[0] == 0):
        return float('inf')
 
    jumps[0] = 0
 
    for i in range(1, n):
        jumps[i] = float('inf')
        for j in range(i):
            if (i <= j + arr[j]) and (jumps[j] != float('inf')):
                jumps[i] = min(jumps[i], jumps[j] + 1)
                break
    return jumps[n-1]
 
arr = list(map(int, input("Enter the array elements: ").split()))
size = len(arr)
 
print('Minimum number of jumps to reach',
      'end is', min_jumps(arr, size))
```

This console application takes an array of integers as input where each integer represents the maximum number of steps that can be made forward from that element. The application calculates the minimum number of jumps you must make in order to get from the start to the end of the array. For this problem, you can assume that it's always possible to reach the end of the array.