package io.level.levelroleplay.banking;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public interface IBankAccount {

    Set<ITransaction> getTransactions();
    void addTransaction(ITransactionBuilder transactionBuilder);
    void removeTransaction(UUID transactionId);

    IBankAccountVault getValue();

    void add(BigDecimal value);
    void subtract(BigDecimal value);
    void multiply(BigDecimal value);
}
