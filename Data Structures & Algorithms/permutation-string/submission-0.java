
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        // 1. Build the frequency map for s1
        for (int r = 0; r < s1.length(); r++) {
            char curr = s1.charAt(r);
            s1Count[curr - 'a']++;
        }

        // 2. Slide a fixed-size window of length s1.length() across s2
        for (int r = 0; r < s2.length(); r++) {
            // Add the incoming character on the right to s2Count
            char curr = s2.charAt(r);
            s2Count[curr - 'a']++;
    // Once the window exceeds s1's length, remove the outgoing character on the left
            if (r >= s1.length()) {
                char leftChar = s2.charAt(r - s1.length());
                s2Count[leftChar - 'a']--;
            }

            // 3. Check if the current window's frequencies match s1
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }
        }

        return false;
    }
}