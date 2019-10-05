package io.unionmc.levelrpg.banking;

import java.math.BigDecimal;

/**
 * Represents a type of in-game currency
 */
public interface ICurrency {

    String getName();

    char getSymbol();

    BigDecimal getRate();

}
