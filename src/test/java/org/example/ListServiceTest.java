package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListServiceTest {
    ListData listData;
    ListData listData1;
    ListData listData2;
    ListService listservice;

    @BeforeEach
    void setUp() {
        listData = new ListData(Arrays.asList(2,2,2), Arrays.asList(5,5,5));
        listData1 = new ListData(Arrays.asList(4,4,4), Arrays.asList(3,3,3));
        listData2 = new ListData(Arrays.asList(3,2,1), Arrays.asList(1,2,3));
        listservice = new ListService(listData);
    }

    @AfterEach
    void tearDown() {
        listData = null;
        listData1 = null;
        listData2 = null;
        listservice = null;
    }

    @Test
    @DisplayName("Проверка метода на вычисление среднего значения")
    void getAverage() {
        assertEquals(2,listservice.getAverage(listData.getList1()));
        assertEquals(5,listservice.getAverage(listData.getList2()));
        assertEquals(4,listservice.getAverage(listData1.getList1()));
        assertEquals(3,listservice.getAverage(listData1.getList2()));
        assertEquals(2,listservice.getAverage(listData2.getList1()));
        assertEquals(2,listservice.getAverage(listData2.getList2()));
    }

    @Test
    @DisplayName("Проверка метода на сравнение средних значений")
    void compareAverage() {
        assertEquals("Второй список имеет большее среднее значение", listservice.compareAverage(listData));
        assertEquals("Первый список имеет большее среднее значение", listservice.compareAverage(listData1));
        assertEquals("Средние значения равны",listservice.compareAverage(listData2));
    }
}