public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0; // Initialize to avoid null pointer exception
        try {
            z = x / y; 
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!"); // Handle the exception gracefully
        }
        System.out.println(z); // Print 0 as the result in case of division by zero.
    }
}