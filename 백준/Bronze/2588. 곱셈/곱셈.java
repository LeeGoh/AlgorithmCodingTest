import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int x = b%10;
        int y = (b/10)%10;
        int z = (b/10)/10;
        
        System.out.println(x*a);
        System.out.println(y*a);
        System.out.println(z*a);
        System.out.println(a*b);
    }
}