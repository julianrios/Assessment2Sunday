package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer appendToListOne : list2) {
            list1.add(appendToListOne);
        }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return getSum(list1) + getSum(list2);
    }

    private Integer getSum(ArrayList<Integer> list) {
        Integer sum = 0;
        for(Integer number : list) {
            sum += number;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        for(Integer number : original) {
            if(number.equals(toRemove)) {
                original.remove(number);
            }
        }
        return original;
    }

    private static <T> Integer indexOf(List<T> list , T elementToFind) {
        int index = -1;

        for (int i = 0; (i < list.size()) && (index == -1); i++) {
            if (list.get(i).equals(elementToFind)) {
                index = i;
            }
        }
        return index;
    }

    public boolean happyList(ArrayList<String> original) {
        for(String word : original) {
            if(word.contains())
        }
        return original.contains();
    }
}
