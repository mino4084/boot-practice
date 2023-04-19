package org.example;

import org.example.logic.BubbleSort;
import org.example.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 구현체에 의존
        // BubbleSort<String> sort = new BubbleSort<>();

        // 인터페이스에 의존, 구현체만 갈아끼움
        Sort<String> sort = new BubbleSort<>();
        //Sort<String> sort = new JavaSort<>();

        System.out.println(sort.sort(Arrays.asList(args)));
    }
}