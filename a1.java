import java.util.*;
public class a1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int num=sc.nextInt();
        int c=0,x=num;
        while(x!=0){
            c++;
            x=x/10;
        }
        System.out.println("No.of digits= "+c);
        
    }
    
}
