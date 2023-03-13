public class Seventh {
    public static void main(String[] args) {

        System.out.println("A");

        int a = 5/10;

        try {
            int g = 5/0;
            System.out.println("Hello");    // this line will never execute because try throw an exception directly without reaching to line 55
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Something went Wrong " + e);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Something Wrong " + e);
        }

        System.out.println("B");
    }
}
