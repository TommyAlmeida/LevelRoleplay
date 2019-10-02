package io.level.levelroleplay.banking.impl;

import io.level.levelroleplay.banking.ICurrency;

public enum  Currencies {
    EUR(new ICurrency() {
        @Override
        public String getName() {
            return "Euro";
        }

        @Override
        public double getRate() {
            return 1.09;
        }
    });

    private ICurrency currency;

    Currencies(ICurrency currency) {
        this.currency = currency;
    }

    public ICurrency getCurrency() {
        return currency;
    }
}
