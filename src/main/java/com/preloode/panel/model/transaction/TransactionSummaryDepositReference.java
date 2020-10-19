package com.preloode.panel.model.transaction;

public class TransactionSummaryDepositReference {


    private TransactionSummaryAmountReference amount;

    private TransactionSummaryCountReference count;


    public TransactionSummaryDepositReference() {



    }


    public TransactionSummaryDepositReference(TransactionSummaryAmountReference amount, TransactionSummaryCountReference count) {

        this.amount = amount;
        this.count = count;

    }


    public TransactionSummaryAmountReference getAmount() {

        return amount;

    }


    public void setAmount(TransactionSummaryAmountReference amount) {

        this.amount = amount;

    }


    public TransactionSummaryCountReference getCount() {

        return count;

    }


    public void setCount(TransactionSummaryCountReference count) {

        this.count = count;

    }


}