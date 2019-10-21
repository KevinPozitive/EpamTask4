package by.epam.unit04.aggr_and_comp.fourth_task.entity;

import java.util.Objects;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null || getClass()!=obj.getClass()){return false;}
        Client client = (Client)obj;
        return Objects.equals(name,client.name);
    }

    @Override
    public String toString() {
        return "Client: " + name;
    }
}
