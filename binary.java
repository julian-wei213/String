import java.util.Scanner;
class binary {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        String rev = "";
        String answer = "";
        
        while(number>0){
            rev = rev + number % 2;
            if(number % 2 == 0){
                number = number/2;
            }else{
                number = (number-1)/2;
            }
        }
        
        for(int i = rev.length()-1; i>=0; i--){
            answer+= rev.charAt(i);
        }
        
        System.out.println(answer);
    }
}
