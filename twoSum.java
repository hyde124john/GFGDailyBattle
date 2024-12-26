class twoSum {
  //Better Approach using HashMap
    boolean twoSum1(int arr[], int target) {
        // code here
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i ++){
            int diff = target - arr[i];
            if(mpp.containsKey(diff)){
                return true;
            }
            else{
                mpp.put(arr[i], diff);
            }
        }
        return false;
    }
  //Optimal Approach
    boolean twoSum2(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int r = n - 1, l =0;
        while(l < r){
            int sum = arr[l] + arr[r];
            if(sum == target){
                return true;
            }
            else if(sum < target){
                l ++;
            }
            else{
                r --;
            }
        }
        return false;
    }
}
