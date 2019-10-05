package io.unionmc.levelrpg.banking.account;

import io.unionmc.levelrpg.banking.IBankAccount;
import io.unionmc.levelrpg.banking.IBankAccountWallet;
import io.unionmc.levelrpg.banking.currency.Currencies;
import io.unionmc.levelrpg.banking.transaction.IBankTransaction;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class BankAccount implements IBankAccount {

    private UUID ownerUuid;

    private IBankAccountWallet wallet;
    private Set<IBankTransaction> transactions;

    public BankAccount(UUID uuid, Currencies currency) {
        this.ownerUuid = uuid;
        this.transactions = new HashSet<>();
        this.wallet = new BankAccountWallet(currency);
    }

    public BankAccount(){
        this(UUID.randomUUID(), Currencies.GOLD);
    }

    @Override
    public Set<IBankTransaction> getTransactions() {
        return transactions;
    }

    @Override
    public void addTransaction(IBankTransaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public void removeTransaction(UUID transactionId) {
        Optional<IBankTransaction> transaction = transactions.stream()
                .filter(t -> t.getUuid().equals(transactionId))
                .findFirst();

        if (!transaction.isPresent()) {
            return;
        }

        transactions.remove(transaction.get());
    }

    @Override
    public IBankAccountWallet getValue() {
        return wallet;
    }

    @Override
    public void add(BigDecimal value) {
        wallet.add(value);
    }

    @Override
    public void subtract(BigDecimal value) {
        wallet.subtract(value);
    }

    @Override
    public void multiply(BigDecimal value) {
        wallet.multiply(value);
    }
}
