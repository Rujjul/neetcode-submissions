class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        for(char c: t.toCharArray()){
            need[c]++;
        }
        int left = 0;
        int req = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;//remembers the starting index of our best window

        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);
            if(need[c]>0){
                req--;
            }
            need[c]--;
            while(req==0){
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                need[leftChar]++;
                if(need[leftChar]>0){
                    req++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
