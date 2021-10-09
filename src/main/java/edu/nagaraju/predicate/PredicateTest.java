package edu.nagaraju.predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> p = (s)-> s.equals("A");
        System.out.println(p.test("A"));
        System.out.println(p.test("B"));

        List<String> list  =  new ArrayList<>();
        list.add("abcd");
        list.add("abcdxxxx");
        list.add("abcdxxxxrrr");
        list.add("ccabcdxxxx");
        list.add("eeabcdxxxx");
        list.add("bbabcdxxxx");
        list.stream().filter(x->x.startsWith("a")).forEach(x->System.out.println(x));

    }



}
