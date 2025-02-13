public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            //This is where the uncommon error lies. We are not handling it properly.
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
        // The program continues even after an error
        System.out.println("Program continues after potential error");
    }
}