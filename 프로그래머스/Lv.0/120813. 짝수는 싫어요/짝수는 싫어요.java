class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n >> 1) + (n & 1)];
        for(int i = 0; i < answer.length; i++) answer[i] = i * 2 + 1;
        return answer;
    }
}