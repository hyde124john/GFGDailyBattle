class HIndex {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 0;
        for (int i = 0; i < n; i++) {
            if (citations[n - 1 - i] >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }
        return hIndex;
    }
}
