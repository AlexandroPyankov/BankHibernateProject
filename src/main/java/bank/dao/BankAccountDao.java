package bank.dao;

import bank.model.BankAccount;

import java.util.Collection;

public interface BankAccountDao {

    void saveAccount(BankAccount bankAccount);
    void deleteAccount (BankAccount bankAccount);
    Collection<BankAccount> findAllAccountsByClientId (int id);
    void updateAccount(BankAccount account);
    BankAccount findAccountById(int id);

}
