package com.example.mypayment;

public class ClientModel {
    private int id;
    private String username;
    private int amount;
    // constructor

    public ClientModel(int id, String username, int amount) {
        this.id = id;
        this.username = username;
        this.amount = amount;
    }

    public ClientModel() {

    }

    @Override
    public String toString() {
        return "ClientModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", amount=" + amount +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAmount() {
        return amount;
    }
}
