package com.duckrace;

import com.duckrace.DuckRacer;
import com.duckrace.Reward;

import java.util.Collection;

public class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer = new DuckRacer(11, "Lance");
        System.out.println(racer);

        racer.win(Reward.PRIZES);
        racer.win(Reward.DEBIT);
        racer.win(Reward.PRIZES);
        racer.win(Reward.DEBIT);

        Collection<Reward> rewards = racer.getRewards();
        System.out.println(rewards);
    }
}