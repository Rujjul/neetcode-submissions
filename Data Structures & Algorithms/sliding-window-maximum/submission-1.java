class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        for(int r=0; r<nums.length; r++){
            //remove elements outside the curr window
            while(!dq.isEmpty() && dq.peekFirst()<=r-k){
                dq.pollFirst();
            }
            //remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()]<= nums[r]) {
                dq.pollLast();
            }
            dq.offerLast(r);//saving index in deque
            //store maximum when window is ready
            if(r>=k-1){
                result[r-k+1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}
