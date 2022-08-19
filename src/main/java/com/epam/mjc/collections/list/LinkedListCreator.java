package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int elem: sourceList){
            if (elem % 2 != 0){
                res.addFirst(elem);
            }else
                res.addLast(elem);
        }

        return res;
    }
}
