import java.util.*;

public class Main {

    public static void main (String[] args) {
        List<String> words = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "One", "Two");
        words.forEach(System.out::println);
        System.out.println("++++++++++++++++++++");
        System.out.println("Unique: ");
        Map<String, Integer> count = new HashMap<>();
        for (String s : words) {
            count.put(s, count.getOrDefault(s, 0) + 1);
             }
        count.entrySet().forEach(System.out::println);
        System.out.println("++++++++++++++++++++");
        System.out.println("No repeat : ");
        Set<String> unique = new HashSet<>(words);
        unique.forEach(System.out::println);

    }
}
