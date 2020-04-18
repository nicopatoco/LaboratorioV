package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericBag<T extends Comparable<T>> {

    private List<T> myList;

    public GenericBag() {
        this.myList = new ArrayList<T>();
    }

    public void add(T object) {
        myList.add(object);
    }

    public T delete(T object) {
        int i = 0;
        Boolean flag = false;
        while (i < myList.size() && !flag) {
            if (myList.get(i).equals(object)) {
                myList.remove(i);
                flag = true;
            }
            i++;
        }
        return object;
    }

    public T getMin() {
        T min = myList.get(0);
        for (T element : myList) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T getMax() {
        T max = myList.get(0);
        for (T element : myList) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public int compareTo(T object) {
        if (myList.contains(object)) {
            return 1;
        }
        return 0;
    }

    public List<T> getMyList() {
        return myList;
    }

    @Override
    public String toString() {
        return "GenericBag{" +
                "myList=" + myList +
                '}';
    }
}
