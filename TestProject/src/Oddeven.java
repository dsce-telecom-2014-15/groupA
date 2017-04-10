import java.util.Arrays;

public class Oddeven {
public static void main(String[] args) {
	int a[] ={1,2,3,45,23,78,67};
	int oddarray[] = new int[a.length], evenarray[]= new int[a.length];
	int j=0,j2=0;
	for (int i = 0; i < a.length; i++)
	{
      if(a[i]%2==0)	
      {
		 evenarray[j]=a[i];
		 j++;
      }
	   else
	   {
			   oddarray[j2]=a[i];
			   j2++;
	   }
	}	
	System.out.println("even array is " + Arrays.toString(evenarray));
	System.out.println("odd array is " + Arrays.toString(oddarray));
}	
	
}

	


