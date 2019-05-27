package mashin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraySort {

    public static void main(String[] args) {
        List<Double> testList = new ArrayList();

        testList.add(0.5);
        testList.add(0.2);
        testList.add(0.9);
        testList.add(0.1);
        testList.add(0.1);
        testList.add(0.1);
        testList.add(0.54);
        testList.add(0.71);
        testList.add(0.71);
        testList.add(0.71);
        testList.add(0.92);
        testList.add(0.12);
        testList.add(0.65);
        testList.add(0.34);
        testList.add(0.62);

        //1 способ
//        Collections.sort(testList);
//        Collections.reverse(testList);

         //2 способ
        Collections.sort(testList, new Comparator<Double>() {
            @Override
            public int compare(Double lhs, Double rhs) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return lhs > rhs ? -1 : (lhs < rhs) ? 1 : 0;
            }
        });

        for (Double d:testList
        ) {
            System.out.println(d);
        }


    }
}
