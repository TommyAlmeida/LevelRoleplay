package io.unionmc.levelrpg.banking.transaction;

import io.unionmc.levelrpg.transactions.ITransaction;

import java.math.BigDecimal;

/**
 * Represents a in-game bank transaction (movement transactions)
 */
public interface IBankTransaction extends ITransaction {

    /**
     * Fetch the amount after the {@link ITransaction} has been done
     *
     * @return bank wallet amount
     */
    BigDecimal getAfterAmount();

    /**
     * Fetch the amount before the {@link ITransaction} has been done
     *
     * @return bank wallet amount
     */
    BigDecimal getBeforeAmount();
}
