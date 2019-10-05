package io.unionmc.levelrpg.transactions;

import java.util.Date;
import java.util.UUID;

/**
 * Represents a in-game log transaction
 */
public interface ITransaction {

    UUID getUuid();

    Date getCreationDate();

    String[] getNotes();
}
