package org.example.Currencies;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Currency {
    private double toRub;

    public Currency(double toRub) {
        this.toRub = toRub;
    }

    public double rubToCurrency(double rub){
        return rub/toRub;
    }
    public double currencyToRub(double currency)
    {
        return currency * toRub;
    }
}
