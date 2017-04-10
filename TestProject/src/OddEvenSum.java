import java.util.Arrays;

public class OddEvenSum {
public static void main(String[] args) {
	int a[] ={1,2,3,45,23,78,67};
	
	
	int oddsum=0,evensum=0;
	for (int i = 0; i < a.length; i++)
	{
      if(a[i]%2==0)	
      {
		 evensum=evensum+a[i];
      }
	   else
	   {
			   oddsum=oddsum+a[i];
	   }
	}	
	System.out.println("sum of even elements in the array is " +evensum);
	System.out.println("sum of odd elements in the array is " +oddsum);
}	
	
}
