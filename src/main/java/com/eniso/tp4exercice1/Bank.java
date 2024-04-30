/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4exercice1;
import com.eniso.tp4exercice1.Customer;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Bank {
    private ArrayList<Customer> clients=new ArrayList<>();

    public Bank(ArrayList<Customer> clients) {
        this.clients = clients;
    }

    public Bank() {
    }
    
    
    
    public void  addCustomer(Customer client){
        clients.add(client);
    }
    
     public void removeCustomer(Customer client){
        clients.remove(client); 
     }
     
    public double getTotalBalance() {
    double tot = 0;
    for (Customer cl : clients) {
        tot += cl.getTotalAccountBalance();
    }
    return tot;
}

}
