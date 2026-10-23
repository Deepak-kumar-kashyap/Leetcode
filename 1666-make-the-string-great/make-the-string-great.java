class Solution {
    public String makeGood(String s) {

     StringBuilder result = new StringBuilder();

     for(char ch : s.toCharArray()){

        if(result.length() > 0){
            int lastc = result.charAt(result.length()-1);
            if(lastc + 32 == ch || lastc - 32 == ch){
                result.deleteCharAt(result.length()-1);
                continue;
            }
        }
        result.append(ch);
     }   

     return result.toString();
    }
}