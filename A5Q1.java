import java.util.*;
public class A5Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr a no.");
		int n= sc.nextInt();
		int rev=0;
		for(int i=n;i!=0;i/=10) {
			int dig=i%10;
			rev=rev*10+dig;
			
		}
		boolean prime1=true,prime2=true;
		for(int i=1;i<=(int)(Math.sqrt(n));i++) {
			if(n%i==0) {
				prime1=false;
				break;
			}
		}
		for(int i=1;i<=(int)(Math.sqrt(rev));i++) {
			if(rev%i==0) {
				prime2=false;
				break;
			}
		}
		if(prime1 && prime2)
			System.out.println(n+"is twisted prime");
		else
			System.out.println(n+"is not twisted prime");
		

	}

}



