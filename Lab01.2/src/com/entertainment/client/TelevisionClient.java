package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class TelevisionClient {
    public static void main(String[] args) {

        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);
        Television tvC = new Television("Sony", 52);
        Television tvD = new Television("Sony", 12);

        System.out.println("Testing the override: " + tvA.equals(tvB));

//        Let's create a Set<Television> and see what happens

//        Hash set: No duplicates, and don't know where they're going to be.
        Set<Television> tvs = new TreeSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        tvs.add(tvC);
        tvs.add(tvD);

//        The size of the tv set should be 3.  TVB is rejected as a duplicate
        System.out.println("The size of the set is: " + tvs.size());
        tvs.forEach(System.out::println);

    }
}