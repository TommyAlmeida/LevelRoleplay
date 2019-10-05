package io.unionmc.levelrpg.banking.account;

import io.unionmc.levelrpg.banking.IBankAccountWallet;
import io.unionmc.levelrpg.banking.ICurrency;
import io.unionmc.levelrpg.banking.currency.Currencies;

import java.math.BigDecimal;

public class BankAccountWallet implements IBankAccountWallet {

    private ICurrency currency;

    private BigDecimal currentAmount;
    private BigDecimal rate;

    public BankAccountWallet(Currencies currencies){
        currency = currencies.getCurrency();

        if(currency != null){
            rate = new BigDecimal(currencies.getCurrency().getRate().doubleValue());
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
