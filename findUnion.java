class findUnion {
    public static int findUnion1(int a[], int b[]) {
        // code here
        HashSet<Integer> unionSet = new HashSet<>();

        // Add all elements from the first array
        for (int num : a) {
            unionSet.add(num);
        }

        // Add all elements from the second array
        for (int num : b) {
            unionSet.add(num);
        }

        // The size of the set represents the number of distinct elements
        return unionSet.size();
    }
}
