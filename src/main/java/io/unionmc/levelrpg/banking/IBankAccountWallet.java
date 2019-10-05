package io.unionmc.levelrpg.banking;

import java.math.BigDecimal;

/**
 * Represents a in-game bank wallet
 */
public interface IBankAccountWallet {

    ICurrency getCurrency();

    BigDecimal getAmount();

    void add(BigDecimal value);

    void subtract(BigDecimal value);

    void multiply(BigDecimal value);
}
