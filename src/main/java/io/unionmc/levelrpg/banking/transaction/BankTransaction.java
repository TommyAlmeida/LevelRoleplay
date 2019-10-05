package io.unionmc.levelrpg.banking.transaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class BankTransaction implements IBankTransaction {

    private UUID uuid;
    private Date creationDate;
    private String[] notes;

    private BigDecimal afterAmount;
    private BigDecimal beforeAmount;

    public BankTransaction(String[] notes, BigDecimal afterAmount, BigDecimal beforeAmount) {
        this.notes = notes;
        this.afterAmount = afterAmount;
        this.beforeAmount = beforeAmount;
        this.uuid = UUID.randomUUID();
        this.creationDate = new Date();
    }

    @Override
    public BigDecimal getAfterAmount() {
        return afterAmount;
    }

    @Override
    public BigDecimal getBeforeAmount() {
        return beforeAmount;
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
    public String[] getNotes() {
        return notes;
    }
}
