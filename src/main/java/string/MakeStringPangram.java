package string;

import java.util.HashMap;
import java.util.Map;

public class MakeStringPangram {

    public static void main(String[] args) {

        String input = "The quick brown fox jumps";

        //Time complexity - 2*O(n) = O(n)
        //Space complexity - 2*O(n) = O(n)
        String result = findMissingCharactersToMakePangram(input);
        System.out.println(result);

        //Time complexity - 2*O(n) = O(n)
        //Space complexity - O(1)
        String resultGFG = findMissingCharactersToMakePangramGFG(input);
        System.out.println(resultGFG);

    }

    private static String findMissingCharactersToMakePangramGFG(String input) {

        boolean[] charPresent = new boolean[26];
        StringBuffer result = new StringBuffer();

        for(char curr : input.toCharArray()){
            if('A'<=curr && curr<='Z')
                charPresent[curr-'A']=true;
            else if('a'<=curr && curr<='z')
                charPresent[curr-'a']=true;
        }

        for(int i=0;i<26;i++){
            if(charPresent[i]==false)
                result.append((char)(i+'a'));
        }

        return result.toString();
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


