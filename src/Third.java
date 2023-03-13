public class Third {
    public static void main(String[] args) {

        System.out.println("A");

        int a = 5/10;

        try{
            int c = 5/0;    // it throws an exception which was handle by catch block
        }
        catch(ArithmeticException e)
        {
            System.out.println("Something Wrong " + e);
        }

        System.out.println("B");
    }
}
