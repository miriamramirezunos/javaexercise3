import java.util.*;
import java.util.stream.Collectors;

public class ParentA {
    public void compare2strings(String stra, String strb){
        System.out.println("Compare 2 strings:");
        if (stra==strb){
            System.out.println("\"" + stra + "\" and \"" + strb + "\" are equals");
        }else {
            System.out.println("\"" + stra + "\" and \"" + strb + "\" are not equals");
        }
    }

    public void isgreaterthan4 (String str){

        System.out.println("\n1.2 - checks if a string length is greater than 4 : ");
        if (str.length()>4) {
            System.out.println("String length greater than 4: \"" + str + "\"");
        }else {
            char[] chararray = str.toCharArray();
            System.out.println("String lenht is nor greater than 4, each character on the string: " + Arrays.toString(chararray));

            //for
        }
    }

    public void sort (List<String> list){
        list.removeAll(Collections.singleton(null));
        Collections.sort(list);
        System.out.println("Sorted values (Ascending):");
        for (int i=0; i<list.size(); i++) System.out.println(list.get(i));
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nSorted values (Descending):");
        for (int i=0; i<list.size(); i++) System.out.println(list.get(i));
    }

    public void removenull (List<String> list){
        System.out.println("\nRemove Null values: ");
        list.stream().filter(value -> value != null).forEach(System.out::println);
    }

    public void missingnumber (){
        List<Integer> listofnumbers = new ArrayList<Integer>();
        listofnumbers.add(2);
        listofnumbers.add(2);
        listofnumbers.add(3);
        listofnumbers.add(4);
        listofnumbers.add(4);
        listofnumbers.add(5);
        listofnumbers.add(6);
        listofnumbers.add(7);
        listofnumbers.add(8);
        listofnumbers.add(10);
        List<Integer> listwithoutdup = listofnumbers.stream().distinct().collect(Collectors.toList());
        System.out.println("List without duplicates: " + listwithoutdup + "\nmissing number(s) in 1 - 10 are:");
        for (int i=1; i<=10; i++){
            boolean exists = false;
            for (int j=0; j<listwithoutdup.size(); j++) {
                if (listwithoutdup.get(j) == i) {
                    exists = true;
                    break;
                }
            }
            if (exists == false){
                System.out.println(i);
            }
        }
    }
}
