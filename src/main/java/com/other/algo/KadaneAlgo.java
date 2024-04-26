package com.other.algo;

public class KadaneAlgo {
    public static void main(String[] args) {
       int max = maxSubArray(new int[]{3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4});
       System.out.println(max);
    }

    public static int maxSubArray(int[] numbers) {
        int maxHere = numbers[0];
        int maxSoFar = numbers[0];
        for(int i= 1;i<numbers.length;++i){
            maxHere = Math.max(numbers[i],maxHere+numbers[i]);
            maxSoFar = Math.max(maxHere,maxSoFar) ;
        }
        return maxSoFar;
    }
}
