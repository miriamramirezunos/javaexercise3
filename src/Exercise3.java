import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main (String arg[]){
        String stringA = "String A", stringB = " String B", stringC = "str";
        // 1 - Compare 2 strings
        ParentA parent = new ParentA();
        System.out.println("1.1 - Parent A");
        parent.compare2strings(stringA, stringB);
        // checks if a string length is greater than 4
        parent.isgreaterthan4(stringC);
        // 2 - Use functionality from (A) in a new method from (B).
        ChildB child = new ChildB();
        System.out.println("\n2 - Child B using method from Parent A");
        child.compare2strings(stringA, stringB);
        // 3 - Create and implements interface
        System.out.println("\n3 - Create and implements interface");
        child.print();
        // 4 - Create a list of strings, orders by desc and asc, removes null values
        List<String> listofstrings = new ArrayList<String>();
        listofstrings.add("Text");
        listofstrings.add("Baseball");
        listofstrings.add("Automation");
        listofstrings.add("Java");
        listofstrings.add("Laptop");
        listofstrings.add(null);
        System.out.println("\n4 - Create a list of strings, orders by desc and asc, removes null values");
        parent.sort(listofstrings);
        parent.removenull(listofstrings);
        // 5 - Method that gives the missing number from a List of integers
        System.out.println("\n5 - Method that gives the missing number from a List of integers");
        parent.missingnumber();
    }

}
