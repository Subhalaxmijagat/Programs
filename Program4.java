import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        
        Map<Integer, Integer> multipleCounts = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            multipleCounts.put(i, 0);
        }
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multipleCounts.put(i, multipleCounts.get(i) + 1);
                }
            }
        }
        System.out.println(multipleCounts);
    }
}
