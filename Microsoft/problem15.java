// 1358. Number of Substrings Containing All Three Characters

class Solution {
    public int numberOfSubstrings(String s) {
       int[] count = new int[3];
       int ans = 0;
       for (int lo = -1, hi = 0; hi < s.length(); ++hi) {
           ++count[s.charAt(hi) - 'a'];
           while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
               ans += s.length() - hi; 
               --count[s.charAt(++lo) - 'a'];
           }
       } 
       return  ans;        
   }
}
