import java.util.Scanner;

public class findPattern {
    
    public static int findpattern(String s, String p){
        int m = s.indexOf(p);
        return m;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String s = sc.next();

        System.out.print("Enter pattern to find : ");
        String p = sc.next();

        int w = findpattern(s,p);
        System.out.println("The pattern is present at index : " + w);

        sc.close();
    }
}
