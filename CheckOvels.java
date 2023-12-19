import java.util.Arrays;

public class CheckOvels {
	
	public static void main(String[] args) {
		String str="captain";
		String s1="";
		
		for(int i=0;i<str.length()-1;i++){
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'  ){
				
				s1+=ch;
				
			}
			else{
				continue;
			}
			remove(s1);
			}
		
  	
		}

	private static String remove(String s1) {
		
	char[]arr=s1.toCharArray();
		

		for (int j = 0; j < arr.length; j++) {
			
		 boolean flag=true;
		 for (int i = 0; i < arr.length; i++) {
			  if(arr[i]==arr[j]&&i!=j){
				  flag=false;
				  break;
			  }
			  
		}
		if(flag==true){
			System.out.print(arr[j]+ " ");
		}
		

	}
		return null;
	}
  		
	}

