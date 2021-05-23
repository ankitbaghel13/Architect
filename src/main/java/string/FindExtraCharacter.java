package string;

import java.util.HashMap;
import java.util.Map;

public class FindExtraCharacter {

    public static void main(String[] args) {

        //Time complexity - 3*O(n) = O(n)
        //Space complexity - 2*O(n) = O(n)
        System.out.println(findExtraCharacterBetweenTwoString("abcd","cbdae"));

        //Time complexity - 3*O(n) = O(n)
        //Space complexity - O(1)
        System.out.println(findExtraCharacterBetweenTwoStringGFG("abcd","cbdae"));
    }

    private static Character findExtraCharacterBetweenTwoStringGFG(String str1, String str2) {

        String smallString;
        String largeString;
        if(str1.length()>str2.length()){
            smallString = str2;
            largeString = str1;
        }else {
            smallString = str1;
            largeString = str2;
        }

        int smallStringCodeTotal=0;
        int largeStringCodeTotal=0;
        int i=0;

        for(;i<smallString.length();i++){
            smallStringCodeTotal += smallString.charAt(i);
            largeStringCodeTotal += largeString.charAt(i);
        }
        largeStringCodeTotal += largeString.charAt(i);

        return (char)(largeStringCodeTotal-smallStringCodeTotal);
    }

    private static Character findExtraCharacterBetweenTwoString(String str1, String str2) {

        Map<Character,Integer> firstStringMap = new HashMap<>();
        Map<Character,Integer> secondStringMap = new HashMap<>();

        for(Character ch : str1.toCharArray()){
            if(firstStringMap.get(ch)==null)
                firstStringMap.put(ch,1);
            else
                firstStringMap.put(ch,firstStringMap.get(ch)+1);
        }

        for(Character ch : str2.toCharArray()){
            if(secondStringMap.get(ch)==null)
                secondStringMap.put(ch,1);
            else
                secondStringMap.put(ch,secondStringMap.get(ch)+1);
        }

        for(Map.Entry<Character,Integer> entry : secondStringMap.entrySet()){
            if(entry.getValue() != firstStringMap.get(entry.getKey()))
                return entry.getKey();
        }
        return null;
    }
}
