class kthMissing {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n = arr.length;
        int missingCount = 0; // Count of missing numbers
        int current = 1;     // Start from the smallest positive integer
        int index = 0;       // Pointer to traverse the array

        while (missingCount < k) {
            if (index < n && arr[index] == current) {
                // If `current` exists in the array, move to the next array element
                index++;
            } else {
                // If `current` is missing, increase the count
                missingCount++;
                if (missingCount == k) {
                    return current; // Return the k-th missing number
                }
            }
            current++; // Move to the next number
        }
        return -1; // Default case (should never reach here)
    }
}
