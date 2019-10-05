package io.unionmc.levelrpg.banking.currency;

import io.unionmc.levelrpg.banking.ICurrency;

import java.math.BigDecimal;

public class CurrencyBuilder {

    private String name;
    private char symbol;
    private BigDecimal rate;

    private CurrencyBuilder(String name) {
        this.name = name;
    }

    public static CurrencyBuilder of(String name){
        return new CurrencyBuilder(name);
    }

    public CurrencyBuilder withSymbol(char symbol){
        this.symbol = symbol;
        return this;
    }

    public CurrencyBuilder withRate(BigDecimal rate){
        this.rate = rate;
        return this;
    }

    public ICurrency build(){
        return new BaseCurrency(name, symbol, rate);
    }
}
