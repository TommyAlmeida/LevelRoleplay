package io.unionmc.levelrpg.banking.currency;

import io.unionmc.levelrpg.banking.ICurrency;

import java.math.BigDecimal;

public final class BaseCurrency implements ICurrency {

    private String name;
    private char symbol;
    private BigDecimal rate;

    public BaseCurrency(String name, char symbol, BigDecimal rate){
        this.name = name;
        this.symbol = symbol;
        this.rate = rate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public BigDecimal getRate() {
        return rate;
    }
}