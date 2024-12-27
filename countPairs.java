class countPairs1 {

    int countPairs(int arr[], int target) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            // If the complement exists in the map, it means we found a pair
            if (map.containsKey(complement)) {
                count += map.get(complement); // Add the frequency of the complement
            }

            // Add the current number to the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
