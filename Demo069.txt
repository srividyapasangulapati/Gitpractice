public class Demo069 {
    public class SumArrayElements {
        public static void main(String[] args) {
            int[] numbers = {10, 15, 20, 25, 30, 35, 40, 45, 50};
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of all elements in the array: " + sum);
        }
    }
    
}
