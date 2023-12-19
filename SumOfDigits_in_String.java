public class SumOfDigits_in_String {
    public static int sumOfNumbersInString(String input) {
        int sum = 0;
        int currentNumber = 0;
        boolean inNumber = false;

        for (char c : input.toCharArray()) {
            if (c >= '0' && c <= '9') {
                currentNumber = currentNumber * 10 + (c - '0');
                inNumber = true;
            } else if (inNumber) {
                sum += currentNumber;
                currentNumber = 0;
                inNumber = false;
            }
        }

        if (inNumber) {
            sum += currentNumber;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbersInString("abc123xyz")); // Output: 123
        System.out.println(sumOfNumbersInString("aa11b33"));    // Output: 44
        System.out.println(sumOfNumbersInString("7 11"));        // Output: 18
    }

}
