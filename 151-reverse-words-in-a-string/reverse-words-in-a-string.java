class Solution {
    public String reverseWords(String s) {
        
        StringBuilder ans = new StringBuilder();

        int i = s.length()-1;

        while(i >= 0 ){
            
            // remove all trailing zeros
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            //check value of i
            if(i < 0) break;


            int j = i;
            //find starting index of word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }

            //append the word to ans
            ans.append(s.substring(j+1, i+1));

            //remove the spaces in middle of words
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }

            //if previous word is not first word so add space in btn words
            if(j >= 0 ){
                ans.append(' ');
            }
            
            //put i at last index of remaing word
            i = j;




        }
        return ans.toString();
    }
}