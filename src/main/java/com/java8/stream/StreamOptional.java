/*
 * Decompiled with CFR 0_110.
 */
package com.java8.stream;

import com.java8.stream.BeanPojo;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOptional {
    public static void main(String[] args) {
        StreamOptional.testMap2();
    }

    private static void testMap() {
        BeanPojo beanPojo1 = new BeanPojo("1", "a", 1);
        BeanPojo beanPojo2 = new BeanPojo("2", "b", 2);
        BeanPojo beanPojo3 = new BeanPojo("3", "c", 3);
        BeanPojo beanPojo4 = new BeanPojo("4", "d", 4);
        BeanPojo beanPojo5 = new BeanPojo(null, null, 5);
        ArrayList<BeanPojo> list = new ArrayList<BeanPojo>();
        list.add(beanPojo1);
        list.add(beanPojo2);
        list.add(beanPojo3);
        list.add(beanPojo4);
        list.add(beanPojo5);
        List<String> collect = list.stream().flatMap(o -> o.getObj2() != null ? Stream.of(o.getObj2()) : Stream.empty()).collect(Collectors.toList());
        collect.forEach(x -> {
            System.out.println(x.toString());
        }
        );
        
        list.parallelStream();
        
        list.stream().parallel();
    }

    private static void testMap2() {
        BeanPojo beanPojo11 = new BeanPojo("1", "a", 1);
        Optional<BeanPojo> beanPojo1 = Optional.of(beanPojo11);
        BeanPojo beanPojo22 = new BeanPojo("2", "b", 2);
        Optional<BeanPojo> beanPojo2 = Optional.of(beanPojo22);
        BeanPojo beanPojo33 = new BeanPojo("3", "c", 3);
        Optional<BeanPojo> beanPojo3 = Optional.of(beanPojo33);
        BeanPojo beanPojo44 = new BeanPojo("4", "d", 4);
        Optional<BeanPojo> beanPojo4 = Optional.of(beanPojo44);
        BeanPojo beanPojo55 = new BeanPojo(null, "e", 5);
        Optional<BeanPojo> beanPojo5 = Optional.of(beanPojo55);
        ArrayList<Optional<BeanPojo>> list = new ArrayList<Optional<BeanPojo>>();
        list.add(beanPojo1);
        list.add(beanPojo2);
        list.add(beanPojo3);
        list.add(beanPojo4);
        list.add(beanPojo5);
        Stream<BeanPojo> map = list.stream().filter(x -> ((BeanPojo)x.get()).getObj3() > 1).map(x -> (BeanPojo)x.get());
        System.out.println(map.count());
    }
}

