import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Integer[] testData = generateRandomArray(10000); //10 000 random integers which need to be sorted

        System.out.println("Time comparison: ");
        System.out.println("Arraylist sorted with a modified mergesort algorithm; O(n log(n)):");

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(testData));
        long t1 = System.currentTimeMillis();
        Collections.sort(l1);
        System.out.println(System.currentTimeMillis() - t1 + "ms");

        System.out.println("KachowSortedList: ");

        KachowSortedList<Integer> l2 = new KachowSortedList<>(testData);
        long t2 = System.currentTimeMillis();
        Collections.sort(l1);
        System.out.println(System.currentTimeMillis() - t2 + "ms");


        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Limit testing from 0 to 100 000 values to be sorted in steps of 100");

        for(int i=0;i<100000; i+=100){
            testData = generateRandomArray(i);
            System.out.println(i+" Values:");
            t2 = System.currentTimeMillis();
            l2 = new KachowSortedList<>(testData);
            System.out.println(System.currentTimeMillis() - t2 + "ms");
        }
    }

    private static Integer[] generateRandomArray(Integer n) {
        Integer[] list = new Integer[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list[i] = random.nextInt();
        }
        return list;
    }
}
