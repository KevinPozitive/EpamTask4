package by.epam.unit04.aggr_and_comp.third_task.entity;

import java.util.List;
import java.util.Objects;

public class Client {
    private List<Account> accountList;
    private String clientName;

    public Client(List<Account> accountList, String clientName) {
        this.accountList = accountList;
        this.clientName = clientName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
    public String getClientName() {
        return clientName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountList, clientName);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Client client = (Client) obj;
        return Objects.equals(accountList, client.accountList) &&
                Objects.equals(clientName, client.clientName);
    }
    @Override
    public String toString() {
        return "Client: " + clientName +
                "AccountList:" + accountList;
    }
}
