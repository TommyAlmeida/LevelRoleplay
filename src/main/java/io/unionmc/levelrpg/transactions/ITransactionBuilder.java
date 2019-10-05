package io.unionmc.levelrpg.transactions;

public interface ITransactionBuilder {

    void setNotes(String[] notes);

    <T extends ITransaction> T build();

}
