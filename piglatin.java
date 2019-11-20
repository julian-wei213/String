import java.util.Scanner;
class piglatin{
    public static void main(String str) {
        while (str.length() > 0) {
            int space = str.indexOf(" ");
            if (space < 0) {
                System.out.print(PigLatin(str));
                System.out.println("");
                str = "";
            } else {
                String word = str.substring(0,space);
                System.out.print(PigLatin(word) + " ");
                str = str.substring(space+1);
            }
        }
    }
    public static String PigLatin(String str) {
        if (str.length() < 2) return str;
        String front = str.substring(0,1);
        String theRest = str.substring(1);
        return theRest + front + "ay";
    }
}