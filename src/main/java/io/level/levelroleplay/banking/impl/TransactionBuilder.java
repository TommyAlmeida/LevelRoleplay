package io.level.levelroleplay.banking.impl;

import io.level.levelroleplay.banking.IBankAccountVault;
import io.level.levelroleplay.banking.ITransaction;
import io.level.levelroleplay.banking.ITransactionBuilder;
import java.util.function.Consumer;

public class TransactionBuilder implements ITransactionBuilder {

    private IBankAccountVault afterAmount;
    private IBankAccountVault beforeAmount;
    private String[] notes;

    public TransactionBuilder with(Consumer<TransactionBuilder> consumer){
        consumer.accept(this);
        return this;
    }

    @Override
    public ITransaction build() {
        return new Transaction(afterAmount, beforeAmount, notes);
    }

    public void setAfterAmount(IBankAccountVault afterAmount) {
        this.afterAmount = afterAmount;
    }

    public void setBeforeAmount(IBankAccountVault beforeAmount) {
        this.beforeAmount = beforeAmount;
    }

    public void setNotes(String[] notes) {
        this.notes = notes;
    }
}
