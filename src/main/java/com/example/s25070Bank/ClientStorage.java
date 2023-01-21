package com.example.s25070Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientStorage {
    private List<Client> clients = new ArrayList<>();


    public ClientStorage(){
        clients.add(new Client("1", 500));
        clients.add(new Client("2", 1000));
        clients.add(new Client("3", 100));
        clients.add(new Client("4", 200));
    }

    public List<Client> getClients(){
        return clients;
    }

      public Client getClientById(String id){
            for(Client client : clients){
                if (client.getId().equals(id)){
                    return client;
             }
         }
         return null;
    }
}
