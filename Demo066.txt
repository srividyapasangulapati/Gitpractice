public class Demo066 {
    public class ArrayIndexPrinter {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            System.out.println("Index \t Value");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(i + " \t " + numbers[i]);
            }
        }
    }
    
}