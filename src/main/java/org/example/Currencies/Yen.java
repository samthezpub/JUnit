package org.example.Currencies;

public class Yen extends Currency {
    public Yen(double toRub) {
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
