class Solution {
    public int solution(int[] date1, int[] date2) {
        for(int i = 0; i < date1.length; i++){
            if(date1[i] != date2[i]) return date1[i] < date2[i] ? 1 : 0;
        }
        return 0;
    }
}