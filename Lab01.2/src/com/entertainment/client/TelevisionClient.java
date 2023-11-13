package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TelevisionClient {
    public static void main(String[] args) {
        Set<Television> tvs = new HashSet<Television>();
        Television t1 = new Television();
        Television t2 = new Television("RCA", -10);
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);
        tvs.add(tvA);
        tvs.add(tvB);
        System.out.println(tvs.size());
        System.out.println(tvs);
        System.out.println(tvA == tvB);
        System.out.println(tvA.equals(tvB));
        System.out.println(t1);
        System.out.println(t2);

        tvs.add(t1);
        tvs.add(t2);


        System.out.println("The size of the set is: " + tvs.size());
        for (Television tv : tvs){
            System.out.println(tv);
        }
    }
}