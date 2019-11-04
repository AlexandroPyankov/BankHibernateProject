package bank.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "age")
    private int age;
    @Column(name = "name")
    private String name;
    @Column (name = "address")
    private String address;

    @OneToMany(mappedBy = "clientId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BankAccount> accounts;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
