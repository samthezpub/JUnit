package org.example;

import org.example.Currencies.Currency;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CurrenciesTest {

    @Test
    public void Currency_rubToCurrency_mustReturnCurrencyFromRubTypoDouble(){
       Currency currency = new Currency(100);
       double expended = (double) 100 /100;

       assertEquals(expended, currency.rubToCurrency(100));
    }

    @Test
    public void Currency_currencyToRub_mustReturnRubFromCurrencyTypoDouble(){
        Currency currency = new Currency(100);
        double expended = 2 * 100;

        assertEquals(expended, currency.currencyToRub(2));
    }
}
