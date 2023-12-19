import java.util.HashSet;
import java.util.Set;

public class aaabbc{
    public static int countUniqueCharacters(String string) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : string.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
    }

    public static void main(String[] args) {
        String string = "aaabbc";
        System.out.println(countUniqueCharacters(string));  // Output: 3
    }
}
