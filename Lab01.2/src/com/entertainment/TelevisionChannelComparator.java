package com.entertainment;
import java.util.Comparator;

public class TelevisionChannelComparator implements Comparator<Television> {

    @Override
    public int compare(Television t1, Television t2) {
        return Integer.compare(t1.getCurrentChannel(), t2.getCurrentChannel());
        // Integer tv1 = t1.getCurrentChannel();
        // Integer tv2 = t2.getCurrentChannel();
        // return tv1.compareTo(tv2);

    }
}