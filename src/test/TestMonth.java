package test;

import month.Month;
import month.MonthFactory;

/**
 * Created by Cardoso on 02-Feb-16.
 */
public class TestMonth {
    public static void main (String[]args){
        MonthFactory monthFactory1 = new MonthFactory(Month.JANUARY);
        monthFactory1.convertMonth();
        MonthFactory monthFactory2 = new MonthFactory(Month.MARCH);
        monthFactory2.convertMonth();
        MonthFactory monthFactory3 = new MonthFactory(Month.JULY);
        monthFactory3.convertMonth();
        MonthFactory monthFactory4 = new MonthFactory(Month.OCTOBER);
        monthFactory4.convertMonth();
    }
}
