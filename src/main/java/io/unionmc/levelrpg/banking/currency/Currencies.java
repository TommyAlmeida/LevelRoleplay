package io.unionmc.levelrpg.banking.currency;

import io.unionmc.levelrpg.banking.ICurrency;

import java.math.BigDecimal;

public enum Currencies {
    GOLD(CurrencyBuilder.of("Gold")
            .withRate(new BigDecimal(1.09))
            .withSymbol('g')
            .build());

    private ICurrency currency;

    Currencies(ICurrency currency) {
        this.currency = currency;
    }

    public ICurrency getCurrency() {
        return currency;
    }
}
