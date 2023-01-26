/*
 * Decompiled with CFR 0_110.
 */
package com.java8.service;

import com.java8.service.Color;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArithmeticOperation {
    static List<Color> list = new ArrayList<Color>(){};

    public static void main(String[] args) {
        ArithmeticOperation.methodB(list, col -> col.getColor().equals("red") || col.getColor().equals("white"));
    }

    private static void methodA(List<Color> listRef, Predicate<Color> colorRef) {
        for (Color color : listRef) {
            if (colorRef.test(color)) {
                System.out.println(String.valueOf(color.getColor()) + ":: True");
                continue;
            }
            System.out.println(String.valueOf(color.getColor()) + ":: False");
        }
    }

    private static void methodB(List<Color> listRef, Predicate<Color> colorRef) {
        Stream<Color> filter = listRef.stream().filter(colorRef);
        List collect = filter.collect(Collectors.toList());
        System.out.println(collect);
        List list = listRef.stream().filter(colorRef).collect(Collectors.toList());
        System.out.println(list);
        List collectionArray = listRef.stream().filter(colorRef).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collectionArray);
        ArrayList listEach = new ArrayList();
        listRef.stream().filter(colorRef).forEach(listEach::add);
        System.out.println(listEach);
    }

}

