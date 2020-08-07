package com.example.guavaProject.guava_example;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Multiset<String> animals = HashMultiset.create();
		
		animals.add("cat");
		animals.add("cat");
		animals.add("dog");
		animals.add("mouse");
		animals.add("tiger");
		animals.add("yy");
		
		animals.forEach(System.out::println);
	}
}
