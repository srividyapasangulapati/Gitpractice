public class Demo070 {
    public class PrimeNumbersArray {
        public static void main(String[] args) {
            int[] numbers = {10, 15, 17, 19, 23, 30, 35, 40, 45, 50};
            System.out.println("Prime numbers in the array:");
            for (int number : numbers) {
                if (isPrime(number)) {
                    System.out.println(number);
                }
            }
        }
        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
}
