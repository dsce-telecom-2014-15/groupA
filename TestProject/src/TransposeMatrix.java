import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		int m,n,c,d;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number of rows of rows and columns of matrix");
		m=in.nextInt();
		n=in.nextInt();
		
		int matrix[][]=new int[m][n];
		
         System.out.println("enter the elements of first matrix");
		
		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				matrix[c][d]=in.nextInt();
		
		int transpose[][]=new int[m][n];
		
		for(c=0;c<m;c++)
		{
			for(d=0;d<n;d++)
             transpose[d][c]=matrix[c][d];
	}
		System.out.println("Transpose of entered matrix is");
		
		for(c=0;c<m;c++)
		{
			for(d=0;d<n;d++)
				System.out.println(transpose[c][d]+"\t");
			
			System.out.print("\n");
}
	}
}

