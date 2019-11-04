package bank.dao;

import bank.model.Client;
import bank.utills.hibernate.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Collection;
import java.util.List;

public class ClientDaoImpl implements ClientDao {

    public void addClient(Client client) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(client);
        tx.commit();
        session.close();
    }

    public void updateClient(Client client) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(client);
        tx.commit();
        session.close();
    }

    public Client getClientById(int clientId) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Client client  = session.get(Client.class, clientId);
        session.close();
        return client;
    }

    public Collection<Client> getAllClients() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Client> clients = (List<Client>)session.createQuery("FROM Client").list();
        session.close();
        return clients;
    }

    public void deleteClient(Client client) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(client);
        tx.commit();
        session.close();
    }
}
