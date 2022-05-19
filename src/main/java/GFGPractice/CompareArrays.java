package GFGPractice;

import java.util.HashMap;

public class CompareArrays {
    // write a program to check if the given arrays are same or not
/*
    Given two arrays A and B of equal size N,
    the task is to find if given arrays are equal or not.
    Two arrays are said to be equal if both of them contain same set of elements,
    arrangements (or permutation) of elements may be different though.
*/
    public static void main(String[] args) {
        long[] arr1 = {1,2,2,3,3,4,5,6};
        long[] arr2 = {3,2,1,2,6,4,3,5};
        int N=8;
       System.out.println(check(arr1,arr2,N));

    }

    public static boolean check(long A[],long B[],int N)
    {
        HashMap<Long,Integer> hm= new HashMap<Long,Integer>();
        for(int i=0;i<N;i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i],hm.get(A[i])+1);
            }
            else{
                hm.put(A[i],1);
            }
        }
        for(int i=0;i<N;i++){
            if(hm.containsKey(B[i])){
               /* if(hm.get(B[i])==0){
                    return false;
                }
                hm.put(B[i],hm.get(B[i])-1);
*/            }
            else{
                return false;
            }
        }
        return true;
    }
}
