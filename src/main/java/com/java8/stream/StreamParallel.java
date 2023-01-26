/*
 * Decompiled with CFR 0_110.
 */
package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.functional.Interface.BeanFunction;

public class StreamParallel {
	public static void main(String[] args) {
		StreamParallel.testMap();
	}

	private static void testMap() {
		// BeanFunction<String, String, Integer, BeanPojo> beanFunction = (arg_0, arg_1,
		// arg_2) -> BeanPojo.new(arg_0, arg_1, arg_2);
		BeanFunction<String, String, Integer, BeanPojo> beanFunction = BeanPojo::new;

		BeanPojo beanPojo1 = beanFunction.apply("1", "a", 1);
		BeanPojo beanPojo2 = beanFunction.apply("2", "b", 2);
		BeanPojo beanPojo3 = beanFunction.apply("3", "c", 3);
		BeanPojo beanPojo4 = beanFunction.apply("4", "d", 4);

		ArrayList<BeanPojo> list = new ArrayList<BeanPojo>();
		list.add(beanPojo1);
		list.add(beanPojo2);
		list.add(beanPojo3);
		list.add(beanPojo4);

//        List<Integer> collect = list.stream().limit(2).map(x -> x.getObj3() + 1).collect(Collectors.toList());
//        collect.forEach(x -> {
//            System.out.println(x.toString());
//        }

		list.stream().forEach(x -> {
			System.out.println(x.toString());
		});

		list.stream().parallel().forEach(x -> {
			System.out.println(x.toString());
		});
		
		list.stream().parallel().map( x -> x).forEach(x -> {
			System.out.println(x.toString());
		});
	}
}
