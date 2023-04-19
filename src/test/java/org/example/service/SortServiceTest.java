package org.example.service;

import org.example.logic.BubbleSort;
import org.example.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    // private SortService sortService = new SortService(new JavaSort<String>());
    private SortService sortService = new SortService(new BubbleSort<>());

    @Test
    void test() {
        // given
        // when
        List<String> result = sortService.doSort(List.of("3", "1", "4", "2"));
        // then
        assertEquals(List.of("1", "2", "3", "4"), result);
    }
}