package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int fa = (int) Math.pow(5 * Integer.parseInt(a), 2) + 3;
        int fb = (int) Math.pow(5 * Integer.parseInt(b), 2) + 3;

        return fa == fb ? aInt - bInt : fa - fb;
    }
}
