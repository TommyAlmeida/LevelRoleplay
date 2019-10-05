package io.unionmc.levelrpg.banking.transaction;

import java.math.BigDecimal;
import java.util.function.Consumer;

//TODO: remove the fucked up inheritance
public class BankTransactionBuilder implements IBankTransactionBuilder {

    private String[] notes;
    private BigDecimal afterAmount;
    private BigDecimal beforeAmount;

    public void setAfterAmount(BigDecimal afterAmount) {
        this.afterAmount = afterAmount;
    }

    public void setBeforeAmount(BigDecimal beforeAmount) {
        this.beforeAmount = beforeAmount;
    }



    public IBankTransactionBuilder with(Consumer<IBankTransactionBuilder> consumer){
        consumer.accept(this);
        return this;
    }

    public void setNotes(String[] notes) {
        this.notes = notes;
    }

    @Override
    public IBankTransaction build() {
        return new BankTransaction(notes, afterAmount, beforeAmount);
    }
}
