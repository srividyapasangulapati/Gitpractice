public class Demo068 {
    public class EvenNumbersCount {
        public static void main(String[] args) {
            int[] numbers = {10, 15, 20, 25, 30, 35, 40, 45, 50};
            int count = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    count++;
                }
            }
            System.out.println("Count of even numbers in the array: " + count);
        }
    }
    
}
