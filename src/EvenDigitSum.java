public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {
        // given positive number = 123456789, returns 2+4+6+8 = 20
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 1) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            number /= 10;
        }
        return sum;
    }

}
