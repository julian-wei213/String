import java.util.Scanner;
class Palindrome{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = "";
        
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122){
                word += str.charAt(i);
            }
        }
        
        String reverse = "";
        for(int a = word.length()-1; a>=0; a--){
            reverse += word.charAt(a);
        }
        
        if(word.equals(reverse)){
            System.out.println(str+ " is Palindrome");
        }else{
            System.out.println(str+ " is not Palindrome");
        }
        
        
    }
}