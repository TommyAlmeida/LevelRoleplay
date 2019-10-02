package io.level.levelroleplay.banking.impl;

import io.level.levelroleplay.banking.IBankAccountVault;
import io.level.levelroleplay.banking.ITransaction;

import java.util.Date;
import java.util.UUID;

public class Transaction implements ITransaction {

    private UUID uuid;
    private Date creationDate;
    private String[] notes;
    private IBankAccountVault afterAmount;
    private IBankAccountVault beforeAmount;

    public Transaction(IBankAccountVault afterAmount,
                       IBankAccountVault beforeAmount, String[] notes) {
        this.uuid = UUID.randomUUID();
        this.creationDate = new Date();
        this.afterAmount = afterAmount;
        this.beforeAmount = beforeAmount;
        this.notes = notes;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public IBankAccountVault getAfterAmount() {
        return afterAmount;
    }

    @Override
    public IBankAccountVault getBeforeAmount() {
        return beforeAmount;
    }

    @Override
    public String[] getNotes() {
        return notes;
    }
}
