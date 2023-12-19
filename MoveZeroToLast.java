import java.util.Arrays;

public class MoveZeroToLast {
    	public static void main(String[] args) {
		
		int []arr={ 5,6,0,3,0};
		int j=0;
	int []arr1=new int[arr.length];
	for (int i = 0; i < arr1.length; i++) {
		if(arr[i] != 0){
			arr1[j]=arr[i];
			j++;
		}
		
	}
	System.out.println(Arrays.toString(arr1));
	
	}

}
