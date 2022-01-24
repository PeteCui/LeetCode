class Solution5 {
    public String longestPalindrome(String s) {
        //special string
        if(s.length() < 2){
            return s;
        }
        //declare the start and the end of palindrome
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            //odd, begain expanding from an element
            int len1 = expandAroundCenter(s, i, i);
            //even, begain expanding between two elements
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                //if new len greater than current len update the start and end
                //because i point at the first element before the center when the len of palindrome is even
                //minus one to find the rigth index, mathmatics!
                start = i - (len - 1)/2;
                //plus half of the length to find the index of end
                end = i + len/2;
            }
            //substring function is not include the last element, need to plus one to cover it.
        }
         return s.substring(start, end+1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        //the length is not include the last right element, to minus one
        return right - left - 1;
    }


}
