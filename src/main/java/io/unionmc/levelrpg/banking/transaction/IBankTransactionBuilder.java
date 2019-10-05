package io.unionmc.levelrpg.banking.transaction;

import io.unionmc.levelrpg.transactions.ITransactionBuilder;

public interface IBankTransactionBuilder extends ITransactionBuilder {

    IBankTransaction build();

}
