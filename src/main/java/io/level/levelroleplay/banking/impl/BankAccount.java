package io.level.levelroleplay.banking.impl;

import io.level.levelroleplay.banking.IBankAccount;
import io.level.levelroleplay.banking.IBankAccountVault;
import io.level.levelroleplay.banking.ITransaction;
import io.level.levelroleplay.banking.ITransactionBuilder;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class BankAccount implements IBankAccount {

    private IBankAccountVault vault;
    private Set<ITransaction> transactions;

    public BankAccount() {
        vault = new BankAccountVault(Currencies.EUR);
        transactions = new HashSet<>();
        setupDefaults();
    }

    private void setupDefaults() {
        ITransaction initializeAccount = new TransactionBuilder()
                .with($ -> {
                    $.setBeforeAmount(vault);
                    $.setAfterAmount(vault);
                    $.setNotes(new String[]{"Bank account created!"});
                }).build();

        transactions.add(initializeAccount);
    }

    @Override
    public Set<ITransaction> getTransactions() {
        return transactions;
    }

    @Override
    public void addTransaction(ITransactionBuilder transactionBuilder) {
        transactions.add(transactionBuilder.build());
    }

    @Override
    public void removeTransaction(UUID transactionId) {
        Optional<ITransaction> transaction = transactions.stream()
                .filter(t -> t.getUuid().equals(transactionId))
                .findFirst();

        if (!transaction.isPresent()) {
            return;
        }

        transactions.remove(transaction.get());
    }

    @Override
    public IBankAccountVault getValue() {
        return vault;
    }

    @Override
    public void add(BigDecimal value) {
        vault.add(value);
    }

    @Override
    public void subtract(BigDecimal value) {
        vault.subtract(value);
    }

    @Override
    public void multiply(BigDecimal value) {
        vault.multiply(value);
    }
}
