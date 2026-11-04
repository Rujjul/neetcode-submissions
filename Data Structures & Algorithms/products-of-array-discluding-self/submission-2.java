class Solution {
    public int[] productExceptSelf(int[] nums) {
        int s = nums.length;
        int[] res = new int[s];
        res[0]=1;
        for(int i = 1; i<s; i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int rightProd=1;
        for(int i = s-1;i>=0;i--){
            res[i] = res[i]*rightProd;
            rightProd = rightProd*nums[i];
        }

        return res;
    }
}  
