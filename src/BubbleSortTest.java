import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        List<Comparable> input1 = new ArrayList<>(Arrays.asList(new Integer[]{1, 4, 5, 6, 8, 3, 8}));
        System.out.println(bubbleSort.sort(input1));
        List<Comparable> input2 = new ArrayList<>(Arrays.asList(new Double[]{-9.3,0.2,4.0,0.1,5.0,9.0}));
        System.out.println(bubbleSort.sort(input2));
        List<Comparable> input3 = new ArrayList<>();
        System.out.println(bubbleSort.sort(input3));
        List<Comparable> input4 = new ArrayList<>(Arrays.asList(new Double[]{null,5.0001}));
        System.out.println(bubbleSort.sort(input4));
        System.out.println(bubbleSort.sort(null));
    }
}