package by.epam.unit04.aggr_and_comp.third_task.logic;

import by.epam.unit04.aggr_and_comp.third_task.entity.Account;
import by.epam.unit04.aggr_and_comp.third_task.entity.Client;


import java.util.Collections;
import java.util.Comparator;

public class Action {
    public int allMoney(Client client){
        int sum = 0;
        for(Account account: client.getAccountList()){
            if(account.isBlock()==false) {
                sum += account.getMoney();
            }
        }
        return sum;
    }
    public int positiveMoney(Client client){
        int sum = 0;
        for(Account account:client.getAccountList()) {
            if(account.getMoney()>0&&account.isBlock()==false) {
                sum+=account.getMoney();
            }
        }
        return sum;
    }
    public int negativeMoney(Client client){
        int sum = 0;
        for(Account account:client.getAccountList()) {
            if(account.getMoney()<0) {
                sum+=account.getMoney();
            }
        }
        return sum;
    }
    public Account findAccount(Client client, String numb){
        for(Account account:client.getAccountList()){
            if(account.getAccountNumb().equals(numb)){
                return account;
            }
        }
        return null;
    }
    public Client sortAccounts(Client client){
        Collections.sort(client.getAccountList(), Comparator.comparing(Account::getAccountNumb));
        return client;
    }
}
