package bank.dao;

import bank.model.Client;

import java.util.Collection;

public interface ClientDao {

    void addClient(Client client);
    void updateClient (Client client);
    Client getClientById (int clientId);
    Collection<Client> getAllClients();
    void deleteClient(Client client);

}
