package org.example.Currencies;

public class Pound extends Currency {
    public Pound(double toRub) {
        super(toRub);
    }

    @Override
    public double rubToCurrency(double rub) {
        return super.rubToCurrency(rub);
    }

    @Override
    public double currencyToRub(double currency)
    {
        return currency * getToRub();
    }
}
