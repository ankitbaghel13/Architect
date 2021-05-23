package string;

import java.util.HashMap;
import java.util.Map;

public class MakeStringPangram {

    //Time complexity - 2*O(n) = O(n)
    //Space complexity - 2*O(n) = O(n)
    public static void main(String[] args) {

        String input = "The quick brown fox jumps";
        String result = findMissingCharactersToMakePangram(input);
        System.out.println(result);
    }

    public static String findMissingCharactersToMakePangram(String input) {

        Map<Character, Boolean> characterMap = new HashMap<>();
        for (char ch : input.toCharArray()){
            characterMap.put(Character.toLowerCase(ch),true);
        }

        char[] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        StringBuffer result = new StringBuffer();
        for(Character ch : alphabetArray){
            if(characterMap.get(ch)==null)
                result.append(ch);
        }

        return result.toString();
    }
}


