package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayListA, arrayListB,
                arrayListC = new ArrayList<>();
        Iterator<String> iteratorA, iteratorB;

        arrayListA = scanIn();
        iteratorA = arrayListA.iterator();
        printArr(arrayListA);

        arrayListB = scanIn();
        Collections.reverse(arrayListB);
        iteratorB = arrayListB.iterator();
        printArr(arrayListB);

        while (iteratorA.hasNext() && iteratorB.hasNext()){
            arrayListC.add(iteratorA.next());
            arrayListC.add(iteratorB.next());
        }
        printArr(arrayListC);

        Comparator<String> comparator = (o1, o2) -> {
            Integer length1 = o1.length();
            Integer length2 = o2.length();
            return length1.compareTo(length2);
        };

        arrayListC.sort(comparator);
        printArr(arrayListC);
    }

    public static ArrayList<String> scanIn() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int k = 0;
        while (k != 5) {
            arrayList.add(scanner.next());
            k++;
        }
        return arrayList;
    }

    public static void printArr(ArrayList<String> arrayList){
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
