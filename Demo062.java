public class Demo062 {
    public class ArrayElements {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50, 60, 70};
            if (numbers.length >= 2) {
                System.out.println("First element: " + numbers[0]);
                System.out.println("Second element: " + numbers[1]);
                System.out.println("Last element: " + numbers[numbers.length - 1]);
            } else {
                System.out.println("Array does not have enough elements.");
            }
        }
    }
    
}
