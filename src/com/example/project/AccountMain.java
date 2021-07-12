package com.example.project;

import com.example.project.exception.MyCustomException;
import com.example.project.model.AccountManager;

public class AccountMain {
    public static void main(String[] args) throws Exception {
        AccountManager manager=new AccountManager();
        System.out.println("Bakiyeniz:"+manager.getBalance());
        manager.deposit(100);
        System.out.println("Bakiyeniz:"+manager.getBalance());
        try {
            manager.withdraw(90);
        } catch (MyCustomException exception) {
            System.out.println(exception.getMessage());

        }
        System.out.println("Bakiyeniz:"+manager.getBalance());
        try {
            manager.withdraw(20);
        } catch (MyCustomException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Bakiyeniz:"+manager.getBalance());
    }
}
