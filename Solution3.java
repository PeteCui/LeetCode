import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
    
        HashMap<Character, Integer> hashtable = new HashMap<>();
        //left point
        int left = 0;
        //the maximum result
        int res = 0;
        //the size of the string
        int size = s.length();

        for(int i = 0; i < size; i++){
            char c = s.charAt(i);
            if(hashtable.containsKey(c)){
                //if there is same key in the hashtable, update the left point
                //use Max to prevent the infulence from the character which exists in the hashtable but not in the slide window
                left = Math.max(left, hashtable.get(c)+1);
            }
            //update the hashtable
            hashtable.put(c,i);
            //update the result
            res = Math.max(res, i-left+1);
        }
        return res;
    }
}
