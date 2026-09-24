class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)){
            return 0;
        }
        Queue<String> que = new LinkedList<>();
        que.add(beginWord);
        int steps = 1;
        while(!que.isEmpty()){
            int size = que.size();
            for(int i=0;i<size;i++){
                String word = que.poll();
                if(word.equals(endWord)){
                    return steps;
                }
                char[] chars = word.toCharArray();
            for(int j=0;j<chars.length;j++){
                char ori = chars[j];
                for(char c='a';c<='z';c++){
                    chars[j] = c;

                    String nextWord = new String(chars);
                    if(set.contains(nextWord)){
                        que.add(nextWord);
                        set.remove(nextWord);
                    }
                }
                chars[j] = ori;
            }
            }
            steps++;
        }
        return 0;
    }
}