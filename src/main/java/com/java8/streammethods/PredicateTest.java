/*
 * Decompiled with CFR 0_110.
 */
package com.java8.streammethods;

import com.java8.stream.BeanPojo;
import com.java8.streammethods.PredicateInt;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        PredicateTest.testMap();
    }

    private static void testMap() {
        BeanPojo beanPojo1 = new BeanPojo("1", "a", 1);
        BeanPojo beanPojo2 = new BeanPojo("2", "b", 2);
        BeanPojo beanPojo3 = new BeanPojo("2", "xxxx", 3);
        BeanPojo beanPojo4 = new BeanPojo("4", "c", 4);
        BeanPojo beanPojo5 = new BeanPojo("5", "d", 5);
        ArrayList<BeanPojo> list = new ArrayList<BeanPojo>();
        list.add(beanPojo1);
        list.add(beanPojo2);
        list.add(beanPojo3);
        list.add(beanPojo4);
        list.add(beanPojo5);
        PredicateTest.testPredicate3(list, x -> x < 4);
    }

    private static void testPredicate3(List<BeanPojo> list, Predicate<Integer> impl) {
        for (BeanPojo beanPojo : list) {
            if (!impl.test(beanPojo.getObj3())) continue;
            System.out.println(beanPojo.getObj3());
        }
    }

    private static void testPredicate2(List<BeanPojo> list, Predicate<BeanPojo> impl) {
        for (BeanPojo beanPojo : list) {
            if (!impl.test(beanPojo)) continue;
            System.out.println(beanPojo.getObj3());
        }
    }

    private static void testPredicate(List<BeanPojo> list, PredicateInt impl) {
        for (BeanPojo beanPojo : list) {
            if (!impl.compare(beanPojo.getObj3())) continue;
            System.out.println(beanPojo.getObj3());
        }
    }
}

