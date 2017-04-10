import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int fact=1; int sum =0;
		Scanner readInput = new Scanner(System.in);
		System.out.println("please enter the number you want factorial:");
		int inputNumber = readInput.nextInt();
		if(inputNumber<0)
		{
			System.out.println("negative number");
		}
		else if(inputNumber==0)
		{
			System.out.println("factorial=1");
		}
		else
		{
			for(int i=1;i<=inputNumber;i++)
			{
				fact=fact*i;
				sum += fact;
				
			}
			System.out.println("factorial is="+fact);
		}
		// TODO Auto-generated method stub

	}

}
