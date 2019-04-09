package edu.demo;


public class Demonstration {


    public static void main(String[] args) {

        System.out.println("Task 3 ");
        int arrayLength = 100;
        ListIterator numberOddNumbers = new ListIterator();
        System.out.println("The number of odd numbers in the array -> " + numberOddNumbers.getOddNumbers(addRandTestArray(arrayLength)));
        numberOddNumbers.deleteAllEvenElements(addRandTestArray(arrayLength));

        System.out.println("Task 1 ");
        Object[] objects = {1, 2, 3, 4};
        MyInterfaceImplementation myInterfaceImplementation = new MyInterfaceImplementation(objects);
        System.out.println("Add existing item -> " + myInterfaceImplementation.add(2));
        System.out.println("adding a non-existing item -> " + myInterfaceImplementation.add(6));

        System.out.println("Task 2 ");
        int sizeArrayList1 = (int) (Math.random() * 10);
        int sizeArrayList2 = (int) (Math.random() * 10);
        MultiplyListsDemo multiplyListsDemo = new MultiplyListsDemo();
        multiplyListsDemo.createLists(addRandTestArray(sizeArrayList1), addRandTestArray(sizeArrayList2));
    }

    public static Integer[] addRandTestArray(int length) {
        Integer[] integerTestArray = new Integer[length];
        for (int i = 0; i < integerTestArray.length; i++) {
            integerTestArray[i] = (int) Math.round((Math.random() * 100));
        }
        return integerTestArray;
    }
}