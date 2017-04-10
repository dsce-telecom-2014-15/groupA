import java.util.Scanner;
public class GcdLcm {

	public static void main(String[] args) {
		int a,b,x,y,t,gcd,lcm;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter two numbers");
		x=scan.nextInt();
		y=scan.nextInt();
		
		a=x;
		b=y;
		
		while(b!=0)
		{
			t=b;
			b=a%b;
			a=t;
		}
		gcd=a;
		lcm=(x*y)/gcd;
		
		System.out.println("GCD =" +gcd);
		System.out.println("LCM =" +lcm);

	}

}
