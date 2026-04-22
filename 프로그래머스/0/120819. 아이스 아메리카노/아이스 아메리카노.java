class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int a = 0;
        for(int i=0; i<answer.length; i++){
            if(money == 5500){
                answer[0] = 1;
                answer[1] = money - 5500;
            }else{
                answer[0] = money/5500;
                a = (5500 * answer[0]);
                answer[1] = money - a;
            }
        }
        return answer;
    }
}