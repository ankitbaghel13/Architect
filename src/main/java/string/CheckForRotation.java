package string;

public class CheckForRotation {

    //Time complexity - O(n)
    //Space complexity - O(1)
    public static void main(String[] args) {
        System.out.println(checkStringsForRotation("IndiaUSAEngland","IndiaEnglandUSA"));
    }

    private static boolean checkStringsForRotation(String str1, String str2) {
        return (str2+str2).contains(str1);
    }
}
