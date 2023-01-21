package com.example.s25070Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientStorage {
    private List<Client> clients = new ArrayList<>();


    public ClientStorage(){

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
