public class Fourth {
    public static void main(String[] args) {

        System.out.println("A");

        int a = 5/10;

        try{
            int d = 5/0;
        }
        catch(ArrayIndexOutOfBoundsException e) // we want ArithmeticException, and we use this, so it shows exception error
        {
            System.out.println("Something Wrong " + e);
        }

        System.out.println("B");
    }
}
