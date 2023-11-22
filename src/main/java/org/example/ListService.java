package org.example;

import java.util.List;

public class ListService {
    ListData listData;

    public ListService(ListData listData) {
        this.listData = listData;
    }

    public double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(s -> s)
                .average().orElse(0);
    }

    public String compareAverage(ListData listData) {
        if (ListService.this.getAverage(listData.getList1()) > ListService.this.getAverage(listData
                .getList2())) return "Первый список имеет большее среднее значение";
        else if (ListService.this.getAverage(listData.getList1()) < ListService.this.getAverage(listData
                .getList2())) return "Второй список имеет большее среднее значение";
        else return "Средние значения равны";
    }
}
