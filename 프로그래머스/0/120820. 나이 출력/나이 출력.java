class Solution {
    public int solution(int age) {
        int answer = 0;
        boolean limitCheck = ( 0 < age && age <= 120);
        if(limitCheck) {
            answer = 2022 - age + 1;
        }
        return answer;
    }
}