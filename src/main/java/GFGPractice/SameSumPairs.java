package GFGPractice;

import java.util.HashSet;

public class SameSumPairs {
    // write a program to print the array elements that have a given sum condition.
    /*for example:
    nput: arr[] = {0, -1, 2, -3, 1}
    x= -2
    Output: Pair with a given sum -2 is (-3, 1)*/
    public static void main(String[] args) {
        int[] arr = {10,2,3,1,5,7,8};
        int sum = 12;
        int len = arr.length;
        findPairs(arr,sum,len);
        findPairsWithHashSet(arr,sum,len);
    }
    static void findPairs(int[] incArr,int sum,int len){
        for (int i=0;i<len;i++){
            for (int j = i+1;j<len;j++){
                if (incArr[i]+incArr[j]==sum){
                    // print the pair
                    System.out.println("the pair where sum ==>"+sum +"\tare "+incArr[i]+"\tand "+incArr[j]);
                }
            }
        }
    }

    static void findPairsWithHashSet(int[] incArr, int sum, int len ){
        HashSet<Integer> holdValue = new HashSet<>();
        // traverse the incoming array
        int temp=0;
        for (int i=0;i<len;i++){
            temp = sum -incArr[i];
            if (!holdValue.contains(temp)){
                // add temp to hashset
                holdValue.add(incArr[i]);
            }
            else {
                System.out.println("the catching pairs are \t"+incArr[i] +"and \t"+temp);
            }
        }

    }
}
