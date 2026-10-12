class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        int start = 0, end = sb.length()-1;
        String lower = sb.toString().toLowerCase();
        while(start <= end){
            if(lower.charAt(start) != lower.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
