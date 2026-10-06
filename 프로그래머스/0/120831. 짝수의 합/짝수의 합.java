class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean limitCheck = (0 < n && n <= 1000);
        
        if(limitCheck) {
            if (n%2 == 1) {
                n -= 1;
            }
        
            while(n>0) {
                answer += n;
                n -= 2;
            }
        }
        return answer;
    }
}