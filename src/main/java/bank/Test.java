package bank;

import bank.dao.BankAccountDaoImpl;
import bank.dao.ClientDao;
import bank.dao.ClientDaoImpl;
import bank.model.BankAccount;
import bank.model.Client;

public class Test {

    public static void main(String[] args) {

        ClientDaoImpl dao = new ClientDaoImpl();
        BankAccountDaoImpl accDao = new BankAccountDaoImpl();

        Client client = dao.getClientById(2);
        client.setAddress("Улица Пушкина Домик Кукушкина");


    }
}
