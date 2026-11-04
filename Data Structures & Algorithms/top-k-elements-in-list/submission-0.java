class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>(); // Initialize if empty
            }
            buckets[frequency].add(key);
        }
        int[] res = new int[k];
        int resIndex = 0;
        
        // Loop backwards starting from the highest possible frequency
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                // Add elements from this bucket to our result
                for (int num : buckets[i]) {
                    res[resIndex] = num;
                    resIndex++;
                    
                    // Once we have collected exactly k elements, we can return early
                    if (resIndex == k) {
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
