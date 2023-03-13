public class Eight {
    public static void main(String[] args) {

        System.out.println("A");
        int[] arr = {1,2,3,4};

        try{
            int i = 5/0;
            System.out.println(arr[5]); // this statement is not executed
            System.out.println(arr[0]); // this statement is also not executed
        }
        catch (ArithmeticException e)
        {
            System.out.println("B");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("C");
        }

        System.out.println("D");

    }
}
