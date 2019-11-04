package bank.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bank_accounts")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "client_id", insertable = false, updatable = false)
    private int clientId;
    @Column(name = "money")
    private double money;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client owner;

    @OneToMany (mappedBy = "accountId", fetch = FetchType.EAGER, orphanRemoval = true)
    private List<BankTransaction> bankTransactions;

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public double getMoney() {
        return money;
    }

    public Client getOwner() {
        return owner;
    }

    public List<BankTransaction> getBankTransactions() {
        return bankTransactions;
    }



    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", money=" + money +
                ", owner=" + owner +
                '}';
    }
}
