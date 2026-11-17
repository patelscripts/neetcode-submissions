
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        if(n == 0) return 0;

        int maxlen = 0;
        int start = 0, end = 0;

        while(end < n){
            char curr = s.charAt(end);

            if(map.containsKey(curr)){
                while(map.containsKey(curr)){
                    char ch = s.charAt(start);
                    map.put(ch, map.get(ch) - 1);

                    if(map.get(ch) == 0){
                        map.remove(ch);
                    }
                    start++;
                }
            }

            map.put(curr, map.getOrDefault(curr, 0) + 1);

            maxlen = Math.max(end - start + 1, maxlen);
            end++;
        }

        return maxlen;
    }
}
