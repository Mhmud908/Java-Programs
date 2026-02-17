package restart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
            list.add("Mehmood");
            list.add("Hassan");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);
            list2.add(5);
            list2.add(9);
        System.out.println(list2);

        int value = list2.get(3);
        System.out.println(value);

        list2.remove(2);
        System.out.println(list2);

        list2.set(2, 7);
        System.out.println(list2);

        list2.add(2, 8);
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);


    }
}