package io.unionmc.levelrpg.transactions;

import java.util.Date;
import java.util.UUID;

public class Transaction implements ITransaction {

    private UUID uuid;
    private Date creationDate;
    private String[] notes;

    public Transaction(String[] notes) {
        this.uuid = UUID.randomUUID();
        this.creationDate = new Date();
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
    public String[] getNotes() {
        return notes;
    }
}
