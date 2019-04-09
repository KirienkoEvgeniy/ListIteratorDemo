package edu.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListIterator {

    public int getOddNumbers(Integer[] integerTestArray) {

        ArrayList<Integer> integerTestList = new ArrayList<>(Arrays.asList(integerTestArray));
        Iterator<Integer> iterableTestList = integerTestList.iterator();
        int counter = 0;
        while (iterableTestList.hasNext()) {
            Integer iterator = iterableTestList.next();
            if (iterator % 2 != 0) {
                counter++;

            }
        }
        return counter;
    }

    public void deleteAllEvenElements(Integer[] integerTestArray) {
        ArrayList<Integer> integerTestList = new ArrayList<>(Arrays.asList(integerTestArray));
        Iterator<Integer> iterableTestList = integerTestList.iterator();
        while (iterableTestList.hasNext()) {
            Integer iterator = iterableTestList.next();
            if (iterator % 2 == 0) {
                iterableTestList.remove();
            }
        }
    }
}