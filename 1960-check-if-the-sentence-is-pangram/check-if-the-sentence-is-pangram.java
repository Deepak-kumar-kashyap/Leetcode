class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int[] seen = new int[26];

        for(char c : sentence.toCharArray()){
            seen[c - 'a']++;
        }

        for(int n : seen){
            if(n == 0) return false;
        }
        return true;
    }
}