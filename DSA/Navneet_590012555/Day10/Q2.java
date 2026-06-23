import java.util.*;

class Q2 {
    public static void main(String[] args) {
        String s = "abc";
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray())
            set.add(c);

        System.out.println(set.size() % 2 == 0 ?
                "CHAT WITH HER!" : "IGNORE HIM!");
    }
}