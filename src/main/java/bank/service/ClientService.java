package bank.service;

import bank.dao.ClientDao;
import bank.dao.ClientDaoImpl;
import bank.model.Client;

import java.util.List;

public class ClientService {

    ClientDao dao = new ClientDaoImpl();

    public Client findClientById(int id){
        Client client = dao.getClientById(id);
        return client;
    }

    public List<Client> getAllClients(){
        List<Client> clients = (List<Client>) dao.getAllClients();
        return clients;
    }

}
