import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BubbleSort {
    public List<Comparable> sort(List<Comparable> input) throws IllegalArgumentException{
        if (input == null){
            throw new IllegalArgumentException();
        }
        //omitting all null elements and leaving input unmodified
        List<Comparable> result = new ArrayList<>(input.stream().filter(Objects::nonNull).toList());
        for (int i = 0; i < result.size(); i++) {
            for (int j = 1; j < result.size() - i; j++) {
                if (isGreater(result.get(j-1), result.get(j))){
                    Collections.swap(result, j-1, j);
                }
            }
        }
        return result;
    }

    private boolean isGreater(Comparable greater, Comparable lesser){
        return greater.compareTo(lesser)>0;
    }
}
