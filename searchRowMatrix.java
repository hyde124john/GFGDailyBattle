class searchRowMatrix {
    //BruteForce Solution
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix1(int[][] mat, int x) {
        // code here
        int n = mat.length, m = mat[0].length;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                if(mat[i][j] == x){
                    return true;
                }
            }
        }
        return false;
    }
  //Optimal Approach using Binary Search
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;

        // Perform binary search on each row
        for (int i = 0; i < n; i++) {
            if (binarySearch(mat[i], x)) {
                return true;
            }
        }
        return false;
    }

    // function to perform binary search on a single row
    private boolean binarySearch(int[] row, int target) {
        int left = 0, right = row.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
