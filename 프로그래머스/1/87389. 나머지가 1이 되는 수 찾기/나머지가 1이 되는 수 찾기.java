class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int x=2; x<n; x++) {
            if ((n-1)%x == 0) {
                answer = x;
                break;
            }
        }
        return answer;
    }
}