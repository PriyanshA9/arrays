import java.util.Scanner;

public class checkPalindrome {
    
    public static boolean checkpalin(String s){
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        } 
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        boolean d = checkpalin(s);
        if(d){
            System.out.println("Palindrome");
        } else{
            System.out.println("not palindrome");
        }
        
        sc.close();
    }
}
