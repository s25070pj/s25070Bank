package com.example.s25070Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransferStorage {

    private List<Transfer> transfers = new ArrayList<>();


    public TransferStorage(){

    }

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public Transfer getTransferById(String id){
        for (Transfer transfer : transfers){
            if(transfer.getTransferId().equals(transfer)){
                return transfer;
            }
        }
        return null;
    }

}
