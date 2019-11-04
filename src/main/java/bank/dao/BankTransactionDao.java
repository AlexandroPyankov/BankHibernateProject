package bank.dao;

import bank.model.BankAccount;
import bank.model.BankTransaction;

import java.util.Collection;

public interface BankTransactionDao {

    void saveTransaction (BankTransaction bankTransaction);
    Collection<BankTransaction> getAllTransactionsByAccountId(int accountId);
}
