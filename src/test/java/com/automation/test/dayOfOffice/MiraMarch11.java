package com.automation.test.dayOfOffice;

import java.util.*;

public class MiraMarch11 {
    public static void main(String[] args) {


        Deque<Integer> numbers=new ArrayDeque<>(Arrays.asList(11,34,65,22,8));
        numbers.add(12);
        System.out.println("numbers with Deque method= " + numbers);
        numbers.addLast(222);
        System.out.println("numbers = " + numbers);
        numbers.add(111);
        System.out.println("numbers = " + numbers);

        /**
         * peek():when we say peek basically returns the value (similar to get()
         * poll():returns the value and remove it from the Queue
         * I am using most of the time ArrayList bc I would usually just need to store some values.O would use
         * LinkedList if I know I will need to manipulate my date (consistently add, remove,etc.)
         * Set -->HashSet->for unique values
         * TreeSet ->for unique sorted values
         * Quene-->if I need to check FIFO logic in my project
         * Map Interface:does not accept duplicate keys, can accept null
         * -HashMaP-KEY/VALUE:  can accept null
         * -HashTable-synchronized/no null values
         */






    }
}
