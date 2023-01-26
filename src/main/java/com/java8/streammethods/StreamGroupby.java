/*
 * Decompiled with CFR 0_110.
 */
package com.java8.streammethods;

import com.java8.stream.BeanPojo;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroupby {
    public static void main(String[] args) {
        StreamGroupby.testMap();
    }

    private static void testMap() {
        BeanPojo beanPojo1 = new BeanPojo("1", "a", 1);
        BeanPojo beanPojo2 = new BeanPojo("2", "b", 2);
        BeanPojo beanPojo6 = new BeanPojo("2", "xxxxsdasdad", 4);
        BeanPojo beanPojo3 = new BeanPojo("2", "xxxx", 3);
        BeanPojo beanPojo4 = new BeanPojo("4", "c", 4);
        BeanPojo beanPojo5 = new BeanPojo("5", "d", 5);
        ArrayList<BeanPojo> list = new ArrayList<BeanPojo>();
        list.add(beanPojo1);
        list.add(beanPojo2);
        list.add(beanPojo3);
        list.add(beanPojo4);
        list.add(beanPojo5);
        list.add(beanPojo6);
        Stream stream = list.stream();
        /*Map<String, Optional<BeanPojo>> collect2 = stream.collect(Collectors.groupingBy(BeanPojo::getObj1, Collectors.maxBy(Comparator.comparing(BeanPojo::getObj3))));
        collect2.forEach((k, v) -> {
            System.out.println(String.valueOf(k) + " : " + v.toString());
        }
        );*/
    }
}

