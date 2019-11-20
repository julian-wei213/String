import java.util.Scanner;

class PPAP {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int x = str.indexOf(",");
        
        String val = str.substring(8,x);
        String val2 = str.substring(x+10);
        
        
        System.out.println("Uh!" + val2 + val +".");
    }
}

