package binerygap;

public class Solution {
    public int solution(int N){
        String binery = Integer.toBinaryString(N);
        int r = binery.length()-1;
        int counter = 0;
        int temp = 0;
        while (binery.charAt(r)=='0') {
            r--;
        }

        while (r>0){
            if(binery.charAt(r)=='0'){
                temp++;
                r--;
            }
            else {
                r--;
            }
            if(temp>counter){
                counter=temp;
            }
            if(binery.charAt(r) == '1'){
               temp = 0;
            }
        }
        return counter;
    }
}
