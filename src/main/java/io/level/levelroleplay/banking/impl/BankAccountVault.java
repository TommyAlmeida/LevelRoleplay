package io.level.levelroleplay.banking.impl;

import io.level.levelroleplay.banking.IBankAccountVault;
import io.level.levelroleplay.banking.ICurrency;

import java.math.BigDecimal;

public class BankAccountVault implements IBankAccountVault {

    private ICurrency currency;

    private BigDecimal currentAmount;
    private BigDecimal rate;

    public BankAccountVault(Currencies currencies){
        currency = currencies.getCurrency();

        if(currency != null){
            rate =  new BigDecimal(currency.getRate());
        }
    }

    @Override
    public ICurrency getCurrency() {
        return currency;
    }

    @Override
    public BigDecimal getAmount() {
        return currentAmount;
    }

    @Override
    public void add(BigDecimal value) {
        currentAmount = currentAmount.add(value.subtract(rate));
    }

    @Override
    public void subtract(BigDecimal value) {
        currentAmount = currentAmount.subtract(value.subtract(rate));
    }

    @Override
    public void multiply(BigDecimal value) {
        currentAmount = currentAmount.multiply(value.subtract(rate));
    }
}
