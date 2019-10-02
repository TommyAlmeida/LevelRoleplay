package io.level.levelroleplay.banking;

import java.math.BigDecimal;

public interface IBankAccountVault {

    ICurrency getCurrency();
    BigDecimal getAmount();

    void add(BigDecimal value);
    void subtract(BigDecimal value);
    void multiply(BigDecimal value);
}
