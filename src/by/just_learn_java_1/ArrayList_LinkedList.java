package by.just_learn_java_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArrayList_LinkedList {

    public static final int MILLION = 1000000;
    public static final int THOUSAND = 1000;

    public static void main(String[] args) {
        final ArrayList<Object> arrayList = new ArrayList<>();
        final LinkedList<Object> linkedList = new LinkedList<>();
        final ArrayList<Object> arrayList1 = new ArrayList<>();
        final ArrayList<Object> arrayList2 = new ArrayList<>();
        for (int i = 0; i < MILLION; i++) {
            System.out.print(arrayList.add(i) + " ");
            System.out.print(linkedList.add(i) + " ");
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
           arrayList1.add(arrayList.get((int) (Math.random() * (MILLION - 1))));
        }
        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            arrayList2.add(linkedList.get((int) (Math.random() * (MILLION - 1))));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        System.out.println(arrayList1);
        System.out.println(arrayList2);
    }
}
