class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        int lp = 1;
        for(int i=1;i<nums.length;i++){
            lp *= nums[i-1];
            res[i] = lp;
        }
        int rp = 1;
        for(int j = nums.length-1;j>=0;j--){
            res[j] *= rp;
            rp *= nums[j];
        }
        return res;
    }
}  
