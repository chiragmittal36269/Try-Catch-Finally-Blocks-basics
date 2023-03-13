public class Fifth {
    public static void main(String[] args) {

        System.out.println("A");

        int a = 5/10;

        try{
            int e = 5/0;
        }
        catch(Exception e)  // it can handle any type of exception
        {
            System.out.println("Something Wrong " + e); // here e tells about what type of exception it is.
            // in this case e shows that ArithmeticException
        }

        System.out.println("B");
    }
}
