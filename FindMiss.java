import java.util.Arrays;

public class FindMiss {
	public static void main(String[] args) {
		
		

		int arr[]={1,2,3,4,5,7};
		int res=0;
		Arrays.sort(arr);
	for(int i=0;i<arr.length;i++){
		if(arr[i+1]-arr[i]>1){
			res=arr[i]+1;
			break;
		}
	}
	System.out.println("the missing element :   "+res);

	}
}
