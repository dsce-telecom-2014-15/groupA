import java.util.Scanner;
public class minmaxelement {

	public static void main(String[] args) {
		int x,y,a[]=new int[100];
		
		System.out.println("enter the number of elements");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		x=a[0];
		for(int i=1;i<n;i++)
		{
			if(x<a[i])
				x=a[i];
		}
		System.out.println("largest element=" +x);
		
		y=a[0];
		for(int i=1;i<n;i++)
		{
			if(y>a[i])
				y=a[i];
		}
		System.out.println("smallest element=" +y);

	}

}
