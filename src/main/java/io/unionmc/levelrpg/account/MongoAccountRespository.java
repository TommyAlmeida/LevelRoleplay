package io.unionmc.levelrpg.account;

import org.bson.types.ObjectId;

import java.util.UUID;

public class MongoAccountRespository implements IAccountRegistry<ObjectId> {


    @Override
    public void create(UUID uuid) {

    }

    @Override
    public IAccount<ObjectId> findById(ObjectId objectId) {
        return null;
    }

    @Override
    public IAccount<ObjectId> findByUuid(UUID uuid) {
        return null;
    }
}
