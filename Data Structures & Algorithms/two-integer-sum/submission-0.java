class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int j=0;j<nums.length;j++){
            for(int i=j+1;i<nums.length;i++){
                if(nums[j]+nums[i] == target){
                    arr[0] = j;
                    arr[1] = i;
                    return arr;
                }
            }
        }return arr;
    }
}
