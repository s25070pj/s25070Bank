package com.example.s25070Bank;

public class Client {
    private String id;


    private int saldo;

    public Client(String id, int saldo){
        this.id = id;
        this.saldo = saldo;
    }
    public Client(){

    }

    public int getSaldo() {
        return saldo;
    }

    public String getId() {
        return id;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
