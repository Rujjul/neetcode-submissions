class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            count[curr-'A']++; //add new character into the frequency count
            maxFreq = Math.max(maxFreq, count[curr - 'A']);
            while((right - left + 1)-maxFreq > k){
                char leftchar = s.charAt(left);
                count[leftchar-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left +1);
        }
        return maxLength;
    }
}
