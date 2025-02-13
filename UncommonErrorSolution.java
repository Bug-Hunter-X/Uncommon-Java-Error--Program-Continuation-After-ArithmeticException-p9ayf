public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Critical Error: ArithmeticException encountered. Program terminating.");
            e.printStackTrace(); //Detailed logging for debugging
            System.exit(1); //Proper termination of the program
        } catch (Exception e) {
            System.err.println("Unexpected Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}