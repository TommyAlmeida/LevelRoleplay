package io.level.levelroleplay.banking;

import java.util.Date;
import java.util.UUID;

public interface ITransaction {

    UUID getUuid();

    Date getCreationDate();
    IBankAccountVault getAfterAmount();
    IBankAccountVault getBeforeAmount();

    String[] getNotes();
}
