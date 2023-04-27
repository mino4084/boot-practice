package org.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springpractice.config.config;
import org.springpractice.logic.BubbleSort;
import org.springpractice.logic.Sort;
import org.springpractice.service.SortService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* 자바 oop 버전
        // 구현체에 의존
        // BubbleSort<String> sort = new BubbleSort<>();

        // 인터페이스에 의존, 구현체만 갈아끼움
        Sort<String> sort = new BubbleSort<>();
        //Sort<String> sort = new JavaSort<>();

        System.out.println(sort.sort(Arrays.asList(args)));
         */

        // spring 버전
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        // Sort<String> sort = context.getBean(Sort.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println(sortService.doSort(Arrays.asList(args)));
        // new 사용하지않
    }
}