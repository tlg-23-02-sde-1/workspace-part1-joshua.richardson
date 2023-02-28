package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

class TelevisionClient {
    public static void main(String[] args) {

        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("LG", 50);

        System.out.println("Testing the override: " + tvA.equals(tvB));

//        Let's create a Set<Television> and see what happens

        System.out.println(tvA.hashCode());
        System.out.println(tvB.hashCode());
        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);

//        The size of the tv set should be 1
        System.out.println("The size of the set is: " + tvs.size());
        System.out.println(tvs);

    }
}