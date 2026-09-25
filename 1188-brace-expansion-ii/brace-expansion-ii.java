class Solution {
    public List<String> braceExpansionII(String expression) {
        Set<String> res = parse(expression);
        List<String> ans = new ArrayList<>(res);
        Collections.sort(ans);
        return ans;
    }
    private Set<String> parse(String s){
        Set<String> res = new HashSet<>();
        Set<String> curr = new HashSet<>();
        curr.add("");

        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if((c == ',')){
                res.addAll(curr);
                curr = new HashSet<>();
                curr.add("");
                i++;
            }
            else if(c == '{'){
                int j=i;
                int depth = 0;
                while(j < s.length()){
                    if(s.charAt(j) == '{') depth++;
                    else if(s.charAt(j) == '}') depth--;
                    if(depth == 0) break;
                    j++;
                }
                Set<String> next = parse(s.substring(i+1,j));
                curr = combine(curr,next);
                i = j+1;
            }
            else{
                Set<String> next = new HashSet<>();
                next.add(String.valueOf(c));
                curr = combine(curr,next);
                i++;
            }
        }
        res.addAll(curr);
        return res;
    }
    private Set<String> combine(Set<String> a,Set<String>b){
        Set<String> res = new HashSet<>();
        for(String x : a){
            for(String y : b){
            res.add(x+y);
        }
    }
    return res;
    }   
}
