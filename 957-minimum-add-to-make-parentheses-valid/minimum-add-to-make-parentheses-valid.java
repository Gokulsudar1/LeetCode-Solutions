class Solution {
    public int minAddToMakeValid(String s)
    {
        Stack<Character> stk = new Stack<>();
        for(char ss : s.toCharArray())
        {
            if(ss=='(')
                stk.push(ss);
            else
            {
                if(!stk.isEmpty() && stk.peek()=='(')
                    stk.pop();
                else
                    stk.push(ss);
            }
        }
        return stk.size();
    }
}