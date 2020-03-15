package com.automation.test.dayOfOffice;

import java.util.*;

public class MiraMarch10 {
    public static void main(String[] args) {
        /**
         * Collections:
         * collection is an interface(arayuz) in my work most of the time I would use ArrayList as a list.I never
         * use Queue and I use Set and HashMap.
         * ArrayList(index, faster to read, slower when we do manipulations)menipulations mean remove or add elements
         * I would always go for ArrayList for creating a list.
         *  LinkedList: node(each element reference to prevoius and next element in the list)
         *  Vector
         * ArrayList and Vector are the same, Vector has Thread .. that's the only diffirence between them.
         * Stack() of paper for example. Last in first out
         * ArrayList and LinkedList differences: you can't say which one is go first unless performance
         * sensitive, memory allocation.
         * set Interface:
         * Set is some instructors have not duplicates. set interface doesn't have duplicates,set doesn't have index
         * LinkedHashSet keeps order (int 1,2,3,2,7,3-> 1,2,2,3,3,7)  hashset prints randomly
         * HashSet: hashset always faster(because it is using hashing) hashset prints randomly,allows 1 null
         * TreeSet:
         * LinkedHashSet:
         * Queue:
         * Priority Queue:
         * first in first out can accept duplicates, does not have index
         * ArrayDequeue special in adding and removing
         */
        HashSet<String> hashset=new HashSet<>();
        TreeSet<String>treeSet=new TreeSet<>();
        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
        for(String each: Arrays.asList("Value 5","Value 1","Value 3",null,"Value 6")){
            hashset.add(each);
           // treeSet.add(each);
            linkedHashSet.add(each);
        }
        System.out.println("hashset = " + hashset);
        System.out.println("treeSet = " + treeSet);
        System.out.println("linkedHashSet = " + linkedHashSet);

        Iterator<String> iteratorSet=hashset.iterator();
        while(iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }

        ArrayList<Integer> dropdown= new ArrayList<>(Arrays.asList(1,2,3,6,8,1,-3,9));
        System.out.println("dropdown Arraylist= " + dropdown);

        HashSet<Integer> optionSet=new HashSet<>(dropdown);
        System.out.println("optionSet = " + optionSet);

        if(optionSet.size()==dropdown.size()){
            System.out.println("expected is the same as actual");
        }else{
            System.out.println("options contain some duplicates");
        }
PriorityQueue<String>prioretyQueue=new PriorityQueue<>();
        prioretyQueue.add("Hannahn");
        prioretyQueue.add("Hanssa");
        prioretyQueue.add("Ayse");
        System.out.println("priorityQueue = " + prioretyQueue);
        System.out.println("priorityQueue.peek()"+prioretyQueue.peek());
        System.out.println("priorityQueue.poll() = " + prioretyQueue.poll());
        System.out.println("priorityQueue = " + prioretyQueue);

        ArrayDeque<String> deque=new ArrayDeque<>();



    }
}
