package com.javatunes.billing;

import java.util.HashMap;
import java.util.Map;

public class TaxCalculatorFactory {

    private  static final Map<Location, TaxCalculator> calcMap = new HashMap<>();

    private TaxCalculatorFactory(){}

    public static TaxCalculator getTaxCalculator(Location location){


        /*
        * Consider implementing a cache of TaxCalculator objects
        *
        * If I have not previously created the object(USATax)
        * then I'll create it here with new, add it to my cahce and return it
        *
        * however if my cache already contains it, then i just fetch it
        * from the cache and return it
        *
        * Hint: you could use a simple Map<Location,TaxCalculator> for the cache
        * It would be a 3-row map, each row has Location | TaxCalculator
        */
        if (!calcMap.containsKey(location)){
            switch (location){
                case USA:
                    calcMap.put(location, new USATax());
                    break;
                case EUROPE:
                    calcMap.put(location, new EuropeTax());
                    break;
                case ONLINE:
                    calcMap.put(location, new OnlineTax());
                    break;
        }

        }
        return calcMap.get(location);
    }
}