package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            int index = i + 1;
            if (index % 3 == 0) {
                arrayList.add(sourceList.get(index-1));
                arrayList.add(sourceList.get(index-1));
            }
        }
        return arrayList;
    }
}
