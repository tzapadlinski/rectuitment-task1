import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {
    public Integer count(String input){
        if (input.isEmpty())
            throw new IllegalArgumentException();
        for (char character: input.toCharArray()) {
            if (!Character.isAlphabetic(character))
                throw new IllegalArgumentException();
        }
        int counter = 0;
        for (int i = 0; i < input.length()-1; i++) {
            for (int j = i+1; j < input.length() + 1; j++) {
                if(isBalanced(input.substring(i, j)))
                    counter++;
            }
        }
        return counter;
    }

    private boolean isBalanced(String word){
        Map<Character, Integer> balanceMap = new HashMap<>();
        int balanceCount = 0;
        for (char character : word.toCharArray()) {
            if (balanceMap.containsKey(character)){
                int oldValue = balanceMap.get(character);
                balanceMap.replace(character, oldValue++);
                balanceCount = oldValue;
            }
            else {
                balanceMap.put(character, 1);
                balanceCount = 1;
            }
        }
        for (Integer value: balanceMap.values()) {
            if (!value.equals(balanceCount))
                return false;
        }
        return true;
    }
}
