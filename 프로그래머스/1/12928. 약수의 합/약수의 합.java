import java.util.*;
class Solution {
    public List<Integer> divisor(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i); 
            }
        }
        return divisors;
    }
    
    public int solution(int n) {
        int answer = 0;
        List<Integer> divisors = divisor(n);
        
        for (int num : divisors) {
            answer += num;
        }
        
        return answer;
    }
}