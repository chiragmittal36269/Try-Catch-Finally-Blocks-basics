public class Sixth {
    public static void main(String[] args) {

        System.out.println("A");

        int a = 5/10;

        try{
            int f = 5/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Something Wrong " + e);
        }
        catch (ArrayIndexOutOfBoundsException e)    // this will not execute because it is not an out of bound exception
        {
            System.out.println("Something Went Wrong " + e);
        }

        System.out.println("B");
    }
}
