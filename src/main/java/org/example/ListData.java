package org.example;

import java.util.List;

public class ListData {
    List<Integer> list1;
    List<Integer> list2;

    public ListData(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public List<Integer> getList1() {
        return list1;
    }

    public List<Integer> getList2() {
        return list2;
    }
}