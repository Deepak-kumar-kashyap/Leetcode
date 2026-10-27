class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();

        for(String s : operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(st.peek() * 2);
            }
            else if(s.equals("+")){
                int last = st.peek();
                int secl = st.get(st.size()-2);
                st.push(last + secl);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }

        int total = 0;

        while(!st.isEmpty()){
            total += st.pop();
        }

        return total;
    }
}