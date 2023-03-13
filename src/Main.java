import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arr.add(5 * i);
        }

        System.out.println(arr);

        arr.remove(0);

        System.out.println(arr);

        for (int i = 0; i < 10; i++) {
            System.out.println(arr.get(i));
        }
    }
}