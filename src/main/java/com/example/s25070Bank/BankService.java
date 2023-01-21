package com.example.s25070Bank;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BankService {

    private final ClientStorage clientStorage;
    private final TransferStorage transferStorage;


    public BankService(ClientStorage clientStorage, TransferStorage transferStorage) {
        this.clientStorage = clientStorage;
        this.transferStorage = transferStorage;
    }

    public List<Client> getClients() {
        return clientStorage.getClients();
    }

    public List<Transfer> getTransfers() {
        return transferStorage.getTransfers();
    }


    public void RegisterNewClient(String id, int balance) {
        clientStorage.getClients().add(new Client(id, balance));
    }


    public void MakeTransfer(String clientId, int balance) {
        if (clientStorage.getClientById(clientId).getSaldo()>balance)
            clientStorage.getClientById(clientId).setSaldo(clientStorage.getClientById(clientId).getSaldo() - balance);

    }

    public void DepositFounds(String clientId, int balance) {
        clientStorage.getClientById(clientId).setSaldo(clientStorage.getClientById(clientId).getSaldo() + balance);
    }


    public Client getClientById(String id) {
        for (Client client : clientStorage.getClients()) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

}
//git config --global --add safe.directory F:/3sem/MPR/s25070Bank