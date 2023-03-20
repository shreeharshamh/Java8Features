package FunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex1FunctionPredicate {
    
    public static void main(String[] args) {
        
        // using Function<K, K> 
        Function<Integer, Integer> f = i -> i * i;
        System.out.println(f.apply(12));

        // using Predicate<K>
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(4));
    }
}
