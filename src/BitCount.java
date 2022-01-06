import java.util.ArrayList;
import java.util.List;

public class BitCount {
    public static int countBits (int n) {
        List<Integer> numbers = new ArrayList<>();
        int count=0;

        while (n!=0) {
            numbers.add(n%2);
            n = n/2;
        }
        for (Integer num : numbers) {
            if (num.equals(1)){count++;}
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(897));
    }
}
