package com.javatunes.billing;

public class TaxCalculatorFactory {

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
        TaxCalculator calc = null;
        switch (location){
            case USA:
                calc = new USATax();
                break;
            case EUROPE:
                calc = new EuropeTax();
                break;
            case ONLINE:
                calc = new OnlineTax();
                break;
        }
        return calc;
    }
}