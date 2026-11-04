class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res  = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            // 1. Find the next '#' symbol starting from index i
            int hashIndex = str.indexOf("#", i);
            
            // 2. The number before the '#' is the length of the word
            int length = Integer.parseInt(str.substring(i, hashIndex));
            
            // 3. The word starts right after the '#' and ends 'length' characters later
            int wordStart = hashIndex + 1;
            int wordEnd = wordStart + length;
            String word = str.substring(wordStart, wordEnd);
            
            // 4. Add the word to our result list
            res.add(word);
            
            // 5. Jump 'i' directly to the start of the next encoded string
            i = wordEnd;
        }
        return res;
    }
}
