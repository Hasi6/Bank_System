package com.company;

public class Main {

    public static void main(String[] args) {
        Bank RdbBank = new Bank("RDB");
        RdbBank.addBranch("Mawaramandiya");
        RdbBank.addCustomer("Mawramandiya","Hasi",50000.00);
        RdbBank.addCustomer("Mawramandiya","Tiro",2323232.12);

        RdbBank.addBranch("A");
        RdbBank.addCustomer("A","Hasi",50.00);
        RdbBank.addCustomer("A","Tiro",2323232.12);

        RdbBank.addCustomerTransactions("A","Hasi",23.23);
        RdbBank.addCustomerTransactions("A","Tiro",232.23);

        RdbBank.listCustomers("A",true);
    }
}
