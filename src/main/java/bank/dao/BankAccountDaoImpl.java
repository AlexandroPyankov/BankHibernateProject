package bank.dao;

import bank.model.BankAccount;
import bank.utills.hibernate.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Collection;

public class BankAccountDaoImpl implements BankAccountDao {

    public void saveAccount(BankAccount bankAccount) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bankAccount);
        transaction.commit();
        session.close();
    }

    public void deleteAccount(BankAccount bankAccount) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(bankAccount);
        transaction.commit();
        session.close();
    }

    public Collection<BankAccount> findAllAccountsByClientId(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        ArrayList<BankAccount> accounts = (ArrayList<BankAccount>) session.createQuery("FROM BankAccount WHERE clientId = id ").list();
        return accounts;
    }

    public void updateAccount(BankAccount account) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(account);
        transaction.commit();
        session.close();
    }

    public BankAccount findAccountById(int accountId) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return null;
    }
}
