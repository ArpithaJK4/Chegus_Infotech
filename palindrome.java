public class palindrome {
    public static void main(String[] args) {
	
        String str="MOM";
        String rev="";
        for(int i=str.length()-1; i>=0;i--){
            char ch=str.charAt(i);
            rev=rev+ch;
            
        }
        if(str.equals(rev)){
            System.out.println("palidrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
