class CountTriangles {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr); // Step 1: Sort the array
        int n = arr.length;
        int count = 0;

        // Step 2: Fix the largest side (c) and use two pointers for the remaining sides
        for (int c = n - 1; c >= 2; c--) {
            int i = 0, j = c - 1;

            while (i < j) {
                if (arr[i] + arr[j] > arr[c]) {
                    // All pairs from i to j are valid
                    count += j - i;
                    j--; // Move the right pointer left
                } else {
                    i++; // Move the left pointer right
                }
            }
        }

        return count;
    }
}
