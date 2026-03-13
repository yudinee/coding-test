class Solution {
    public int solution(int[] numbers) {
        int max1;
        int max2;
        if(numbers[0]>numbers[1]){
            max1 = numbers[0];
            max2 = numbers[1];
        }else{
            max1 = numbers[1];
            max2 = numbers[0];
        }
        
        for(int i=2; i<numbers.length; i++){
            if(numbers[i]>max1){
                max2 = max1;
                max1 = Math.max(max1, numbers[i]);
            }else if(numbers[i]>max2){
                max2 = Math.max(max2, numbers[i]);
            }
        }
        int answer = max1 * max2;
        return answer;
    }
}