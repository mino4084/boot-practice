package org.example.service;

import org.example.logic.JavaSort;
import org.example.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        // 위 생성자로 주입받아서 코드가 필요없어짐.
        // Sort<String> sort = new JavaSort<>();

        return sort.sort(list);
    }
}
