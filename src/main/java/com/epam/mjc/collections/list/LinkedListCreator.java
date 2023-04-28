package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        boolean tr1 = false;
        boolean tr2 = false;
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                tr1 = true;
            }
            if (sourceList.get(i) % 2 != 0) {
                tr2 = true;
            }
        }
        if (tr1 && !tr2) {
            list.addAll(sourceList);
        } else if (!tr1 && tr2) {
            for (int i = sourceList.size() - 1; i >= 0; i--) {
                list.add(sourceList.get(i));
            }
        } else if (tr1 && tr2) {
            for (int i = sourceList.size() - 1; i >= 0; i--) {
                if (sourceList.get(i) % 2 != 0) {
                    list.add(sourceList.get(i));
                }
            }
            for (int i = 0; i < sourceList.size(); i++) {
                if (sourceList.get(i) % 2 == 0) {
                    list.add(sourceList.get(i));
                }
            }
        }
        return list;
    }
}
