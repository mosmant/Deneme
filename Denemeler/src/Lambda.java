import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(12, 14, 16, 4, 2, 14, 13, 3, 7, 9, 13));

        int sayi = l.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t).reduce(0, (x, y) -> x + y);
        System.out.println(sayi);

        l.stream().distinct().filter(t -> t % 2 == 0).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));

    }
}
