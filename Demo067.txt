public class Demo067 {
    public class EvenElementsPrinter {
        public static void main(String[] args) {
            int[] numbers = {10, 15, 20, 25, 30, 35, 40, 45, 50};
            System.out.println("Even elements in the array:");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }
    }
    
}
