package bank.model;

import javax.persistence.*;

@Entity
@Table(name = "bank_transactions")
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "account_id")
    private int accountId;
    @Column(name = "amount")
    private double moneyToReceive;
    @Column(name = "receiver_id")
    private int receiverId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "account_id", insertable = false, updatable = false)
    private BankAccount account;

    public int getId() {
        return id;
    }

    public int getAcountId() {
        return accountId;
    }

    public void setAcountId(int acountId) {
        this.accountId = acountId;
    }

    public double getMoneyToReceive() {
        return moneyToReceive;
    }

    public void setMoneyToReceive(double moneyToReceive) {
        this.moneyToReceive = moneyToReceive;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "id=" + id +
                ", acountId=" + accountId +
                ", moneyToReceive=" + moneyToReceive +
                ", receiverId=" + receiverId +
                ", account=" + account +
                '}';
    }
}
