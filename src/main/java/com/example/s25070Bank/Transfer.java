package com.example.s25070Bank;

public class Transfer {
    private String clientId;
    private String transferId;

    private int transferAmount;

    public Transfer(String clientId, String transferId, int transferAmount){
        this.clientId = clientId;
        this.transferId = transferId;

        this.transferAmount = transferAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public String getClientId() {
        return clientId;
    }

    public String getTransferId() {
        return transferId;
    }
}


