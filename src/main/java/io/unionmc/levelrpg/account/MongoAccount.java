package io.unionmc.levelrpg.account;

import dev.morphia.annotations.Embedded;
import io.unionmc.levelrpg.banking.IBankAccount;
import org.bson.types.ObjectId;

import java.util.UUID;

public class MongoAccount implements IAccount<ObjectId> {

    private ObjectId id;
    private UUID uuid;

    @Embedded
    private IBankAccount bankAccount;

    @Override
    public ObjectId getId() {
        return id;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean hasBankAccount() {
        return bankAccount != null;
    }

    @Override
    public IBankAccount getBankAccount() {
        return bankAccount;
    }
}
