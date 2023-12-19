public class Reverse_First {
    public static void main(String[] args) {
	
        String str="java is a programing language";
        String s1="";
        String input1="";
        String rev="";
        s1=str.substring(0,5);
        input1=str.substring(5);
        for (int i = s1.length()-1; i>=0; i--) {
            
                char ch=str.charAt(i);
             
            rev=rev+ch;
               }
        System.out.print(rev);
    String[]input=input1.split(" ");
    for (int i = 0; i < input.length; i++) {
         String reversed = reverseString(input[i]);
          System.out.print(   " "+ reversed + " ");
    }
                   
                  
                }
    
                private static String reverseString(String input) {
                    char[] charArray = input.toCharArray();
                    int start = 0;
                    int end = charArray.length - 1;
    
                    while (start < end) {
                        // Swap characters at start and end indices
                        char temp = charArray[start];
                        charArray[start] = charArray[end];
                        charArray[end] = temp;
    
                        // Move indices towards the center
                        start++;
                        end--;
                        break;
                    }
    
                    return new String(charArray);
                }
    
    
}
