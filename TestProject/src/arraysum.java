import java.util.Scanner;
public class arraysum {

	public static void main(String[] args) {
		int i,n,sum=0,array[];
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=in.nextInt();
		array=new int[n];
		
		System.out.println("enter "+n+" elements");
		for(i=0;i<n;i++)
			array[i]=in.nextInt();
		sum=sum+array[i];
		System.out.println("sum of elements="+sum);
		

	}

}
