package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListDataTest {
    ListData listData;

    @BeforeEach
    void setUp() {
        listData = new ListData(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8));
    }

    @AfterEach
    void tearDown() {
        listData = null;
    }

    @Test
    void getList1() {
        assertEquals(Arrays.asList(1,2,3,4),listData.getList1());
    }

    @Test
    void getList2() {
        assertEquals(Arrays.asList(5,6,7,8),listData.getList2());
    }
}