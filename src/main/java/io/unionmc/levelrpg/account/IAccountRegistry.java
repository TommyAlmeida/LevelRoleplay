package io.unionmc.levelrpg.account;

import java.util.UUID;

public interface IAccountRegistry<Id> {

    void create(UUID uuid);

    IAccount<Id> findById(Id id);
    IAccount<Id> findByUuid(UUID uuid);

}
