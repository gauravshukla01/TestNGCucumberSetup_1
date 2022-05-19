package GFGPractice;

import java.util.HashMap;
import java.util.Map;

public class kRepeatingCharacter {

    // write a program to printt the kth repeating character
    public static void main(String[] args) {
        String test ="geekforgeek";
        int k =2;
        findKRepeatingCharacter(test,k);
        firstRepeatingChar(test);
    }
    // write a function to find out the kth repeating character in the incoming string
    static int findKRepeatingCharacter(String incStr,int pos){
        int flag=0;
        int len = incStr.length();
        HashMap<Character,Integer> charMapping = new HashMap<>();
        HashMap<Character,HashMap<Integer,Integer>> charMappingPos = new HashMap<>();

        for (int i=0;i< len; i++){
            // populate the hashmap with the character and their frquency
            char c = incStr.charAt(i);
            // if the character is not present in the hashmap then add with key =1 else inc the key value by +1
            if(!charMapping.containsKey(c)){
                charMapping.put(c,1);
            }else {
                charMapping.put(c,charMapping.get(c)+1);
            }
        // write a program to get the character of the string and their position in the actual string


        } // end of traverseing the string.

        int repeatNum=0;
        for (int t=0;t<len;t++){
            char y = incStr.charAt(t);
            repeatNum = charMapping.get(y);
           // childMap.clear();
            HashMap<Integer,Integer> childMap = new HashMap<>(); // this is needed here so that with every key in the charmappingpos we have a fresh child
            // map
            for (Map.Entry<Character,Integer> et : charMapping.entrySet()){

            if (Character.compare(y,et.getKey())==0){
              //  System.out.println("y==>"+y +"\t value from the map ==>"+et.getKey()+"\trepeatcount = \t"+repeatNum);
                childMap.put(t,repeatNum);
                    if(!charMappingPos.containsKey(y)){
                        charMappingPos.put(y,childMap);
                    }

                }

            }

        }
        // iterate thru the map of maps
        for (Map.Entry<Character,HashMap<Integer,Integer>> entry : charMappingPos.entrySet()){
            HashMap<Integer,Integer> childMap1 = entry.getValue();

            System.out.println("inside iterations key ==>\t\t"+entry.getKey());
            System.out.println("inside iterations value ==>\t\t"+entry.getValue());
          /*  for (Map.Entry childEntry : childMap1.entrySet()){

                System.out.println("Character ==>"+entry.getKey());
               System.out.println("Child key: index position==>"+childEntry.getKey()+"\t Child value , repeat time"+childEntry.getValue());
            }*/

        }

        return flag;
    }

    static void firstRepeatingChar(String incStr){
        int len = incStr.length();
        HashMap<Character,Integer> charMAp = new HashMap<>();
        for (int i=0;i<len;i++){
            char c = incStr.charAt(i);
            if(!charMAp.containsKey(c)){
                charMAp.put(c,1);
            }
            else {
                System.out.println("first repeating character ==>"+c);
                break;
            }
        }
    }
}
