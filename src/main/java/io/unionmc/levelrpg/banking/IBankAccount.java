package io.unionmc.levelrpg.banking;

import io.unionmc.levelrpg.banking.transaction.IBankTransaction;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public interface IBankAccount {

    Set<IBankTransaction> getTransactions();
    void addTransaction(IBankTransaction transaction);
    void removeTransaction(UUID transactionId);

    IBankAccountWallet getValue();

    void add(BigDecimal value);
    void subtract(BigDecimal value);
    void multiply(BigDecimal value);
}
