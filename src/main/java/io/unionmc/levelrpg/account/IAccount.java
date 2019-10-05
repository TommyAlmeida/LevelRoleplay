package io.unionmc.levelrpg.account;

import io.unionmc.levelrpg.banking.IBankAccount;

import java.util.UUID;

public interface IAccount<Id> {

    Id getId();

    UUID getUuid();

    boolean hasBankAccount();
    IBankAccount getBankAccount();
}
