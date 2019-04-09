package edu.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyListsDemo {

    public void createLists(Integer[] integerTestArray1, Integer[] integerTestArray2) {
        List<Integer> testList1 = new ArrayList<>(Arrays.asList(integerTestArray1));
        List<Integer> testList2 = new ArrayList<>(Arrays.asList(integerTestArray2));
        List<Integer> result = new ArrayList<>();
        System.out.println(testList1 + " ");
        System.out.println(testList2 + " ");
        int size1 = testList1.size();
        int size2 = testList2.size();

        if (size1 > size2) {
            for (int i = 0; i < size1; i++) {
                Integer elem1 = testList1.get(i);
                if (i < size2) {
                    Integer elem2 = testList2.get(i);
                    Integer rus = elem1 * elem2;
                    result.add(rus);
                } else {
                    result.add(elem1);
                }
            }
        } else {
            for (int i = 0; i < testList1.size(); i++) {
                Integer elem1 = testList1.get(i);
                Integer elem2 = testList2.get(i);
                Integer rus = elem1 * elem2;
                result.add(rus);
            }
            List<Integer> tale = testList2.subList(size1, size2);
            result.addAll(tale);
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}


