package by.epam.unit04.aggr_and_comp.third_task.entity;

import java.util.Objects;

public class Account {
    private String accountNumb;
    private int money;
    private boolean block;

    public Account(String accountNumb, int money, boolean block) {
        this.accountNumb = accountNumb;
        this.money = money;
        this.block = block;
    }

    public String getAccountNumb() {
        return accountNumb;
    }
    public int getMoney() {
        return money;
    }
    public boolean isBlock() {
        return block;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumb,money,block);
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null||obj.getClass()!=getClass()){return false;}
        Account account = (Account) obj;
        return block == account.block &&
                money == account.money &&
                Objects.equals(accountNumb,account.accountNumb);
    }
    @Override
    public String toString() {
        return "Account: " + accountNumb + " block: " +
                "money:" + money;
    }
}
