package GFGPractice;

import java.util.Arrays;

public class KNonRepeatingCharacter {
    // WAP to find the kth non repeating character in a given string.

    public static void main(String[] args) {
        String test = "GeekForGeek";
        int k =1;
      //  (int u =findKnonRepeating(test,k))?System.out.println("kth repeating char ==>"+test.toCharArray()[u]):System.out.println("no repeating char");
        int u =findKnonRepeating(test,k);
        if (u==-1){
            System.out.println("no repeating char");
        }else System.out.println("kth repeating char ==>"+test.charAt(u));
    }

    static int findKnonRepeating(String incStr, int k){
        boolean flag =false;
        int len = incStr.length();
        int[] totChar = new int[256];
        int[] index = new int[256];

        // set all the initial values
        for (int i=0;i<totChar.length;i++){
            totChar[i]=0;
            index[i]=len;
        }

        // traverse thru the incoming string and add the counter in the char arraay as per the char at i
        for (int y=0;y<len;y++){
            char c = incStr.charAt(y);
            totChar[c]=totChar[c]+1;
            index[c]=y;
            // if the value at totChar >1 then set the index = len (not to be considered)
            if (totChar[c]>1){
                index[c]=len; // this indicates a repeated character
            }

        }
        Arrays.sort(index);
        System.out.println(index);
        if(index[k-1]!=len){
            System.out.println("kth non repeating character ==>"+index[k-1]);
            return index[k-1];
        }
        else return -1;
    }
}
