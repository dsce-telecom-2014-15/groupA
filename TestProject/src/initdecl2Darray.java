
public class initdecl2Darray {

	public static void main(String[] args) {
		int [][]arr = new int[4][2];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = i+j;
		
			}

	}

}
}
