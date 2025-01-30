# Prefix Sum Pattern
    Prefix sum is a cumulutive sum of an array from the start of an array to give index
    Here's how you can create the prefix sum array
    ```
    int prefixSum  = new int[arr.length]
    prefixSum[0] = arr[0];
    for(int i=1;i<arr.length;i++){
        prefixSum[i] = prefixSum[i-1] + arr[i];
    }
    return prefixSum;
    ```
    
    ## One thing to remember if you dont need new array you can modify existing array, if there are time constraints.
    
    ```
    for(i=1;i<arr.length;i++){
        arr[i]=arr[i-1]+arr[i];
    }
    return arr;
    ```
    Some problems of this pattern
    303. Range Sum Query - Immutable : Time Complexity of this code is O(n)
    