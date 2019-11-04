package bank.dao;

import bank.model.BankTransaction;
import bank.utills.hibernate.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Collection;
import java.util.List;

public class BankTransactionDaoImpl implements BankTransactionDao {

    public void saveTransaction(BankTransaction bankTransaction) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bankTransaction);
        transaction.commit();
        session.close();
    }

    public Collection<BankTransaction> getAllTransactionsByAccountId(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<BankTransaction> transactions = (List<BankTransaction>) session.createQuery("FROM BankTransaction WHERE accountId = id").list();
        session.close();
        return transactions;
    }
}
