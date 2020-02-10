import java.lang.invoke.MethodHandleImpl;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        long NUM = 600851475143L;
        int delNUM;
        ArrayList<Integer> array = new ArrayList<>();
        int n = 0;
        int k = 0;

        for (int i = 3; i <= 10001; i++) {
            k = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k += 1;
                }
            }
            if (k == 0) {
                array.add(i);
            }
        }

        for (int i = 0; i < 10000; i++) {
            if (NUM % MethodHandleImpl.array(i) == 0) {
                System.out.println(i);
            }
        }
    }
}
