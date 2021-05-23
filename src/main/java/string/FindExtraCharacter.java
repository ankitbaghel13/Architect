package string;

import java.util.HashMap;
import java.util.Map;

public class FindExtraCharacter {

    //Time complexity - 3*O(n) = O(n)
    //Space complexity - 2*O(n) = O(n)
    public static void main(String[] args) {
        System.out.println(findExtraCharacterBetweenTwoString("abcd","cbdae"));
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
