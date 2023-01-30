public class BalancedWordsCounterTest {
    public static void main(String[] args) {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        String test1 = "aabbabcccba";
        System.out.println(counter.count(test1));
        String test2 = "";
        System.out.println(counter.count(test2));
        String test3 = "abababa1";
        System.out.println(counter.count(test3));
    }
}
