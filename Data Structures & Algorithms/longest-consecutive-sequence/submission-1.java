class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);    
        }

        int ans=0;
        for(int i=0;i<nums.length;i++){
            if (!set.contains(nums[i] - 1)) {
                int len = 1; // A sequence starts with a minimum length of 1
                int curr = nums[i];
                
                while (set.contains(curr + len)) {
                    len++;
                }
                
                ans = Math.max(len, ans);
            }
        }
        return ans;
    }
}
