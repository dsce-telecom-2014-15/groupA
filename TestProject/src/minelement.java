import java.util.Scanner;
public class minelement {

	public static void main(String[] args) {
		int i,n,min,array[],d;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=in.nextInt();
		array=new int[n];
		
		System.out.println("enter "+n+" elements");
		for(i=0;i<n;i++)
			array[i]=in.nextInt();
		min=array[0];
		for(i=0;i<n;i++)
		{
			if(array[i]<min)
				min=array[i];
		}
	
	}
	int sec_min=array[0];
	for(int i=0;i<n;i++)
	{
		if(array[i]<sec_min && array[i]!=min)
		{
			sec_min=array[i];
		}
	}
		
System.out.println("smallest number="+min);
	}
}


