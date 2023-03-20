// package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0; 
    }
    
}
public class Ex5ComparatorMethod {
    public static void main(String[] args) {
        // create an instance of ArrayList<Integer> and add elements to it.
        ArrayList<Integer> al = new ArrayList<>();
        al.add(99);       
        al.add(456);       
        al.add(23);       
        al.add(11);       
        al.add(333);       
        al.add(434);       
        al.add(23);       
        // print ArrayList values
        System.out.println(al);
        // sort using custom sorting through Comparator<Integer>
        Collections.sort(al, new MyComparator());
        // pringArrayList values after sorting
        System.out.println(al);

        // Comparator<Integer> using Lambda Expression
        Comparator<Integer> c = (o1, o2) -> {
            return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0; 
        };
        
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(5);
        al1.add(4);
        al1.add(3);
        al1.add(2);
        al1.add(1);
        al1.add(7);
        System.out.println(al1);
        Collections.sort(al1, c);
        al1.stream().forEach(System.out::println);
    }
}