class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if('0' <= c && c <= '9') answer += c - '0';
        }
        return answer;
    }
}