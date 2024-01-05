package com.asif.Prototype;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating Object with Prototype Design Pattern..!");

        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.68.14.22");
        networkConnection.loadImportantData();

        System.out.println(networkConnection);

        // we want to create new object of  network connection

        try{
            NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();

            System.out.println(networkConnection1);
            System.out.println(networkConnection2);

        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
