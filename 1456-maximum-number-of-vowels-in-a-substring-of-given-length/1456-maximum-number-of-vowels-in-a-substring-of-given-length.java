class Solution {
        private boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
    public int maxVowels(String s, int k) {
        
        int count=0;

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
            count++;
        }
        }
        int ans=count;

        for(int i=k;i<s.length();i++){
            char incoming=s.charAt(i);
            char outgoing=s.charAt(i-k);

            if(isVowel(incoming)){
                count++;
            }
            if(isVowel(outgoing)){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
     
}