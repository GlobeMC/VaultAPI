package net.milkbowl.vault.economy;

import org.bukkit.OfflinePlayer;

import java.util.UUID;

public abstract class AbstractEconomy implements Economy {

    @Override
    public double getBalance(String accountHolder) {
        return getBalance(accountHolder);
    }

    @Override
    public double getBalance(UUID accountHolder) {
        return getBalance(accountHolder);
    }

    @Override
    public double getBalance(OfflinePlayer accountHolder) {
        return getBalance(accountHolder.getUniqueId());
    }

    @Override
    public boolean has(String accountHolder, double amount) {
        return has(accountHolder, amount);
    }

    @Override
    public boolean has(UUID accountHolder, double amount) {
        return has(accountHolder, amount);
    }

    @Override
    public boolean has(OfflinePlayer accountHolder, double amount) {
        return has(accountHolder, amount);
    }

    @Override
    public EconomyResponse withdraw(String accountHolder, double amount) {
        return withdraw(accountHolder, amount);
    }

    @Override
    public EconomyResponse withdraw(UUID accountHolder, double amount) {
        return withdraw(accountHolder, amount);
    }

    @Override
    public EconomyResponse withdraw(OfflinePlayer accountHolder, double amount) {
        return withdraw(accountHolder, amount);
    }

    @Override
    public EconomyResponse deposit(String accountHolder, double amount) {
        return deposit(accountHolder, amount);
    }

    @Override
    public EconomyResponse deposit(UUID accountHolder, double amount) {
        return deposit(accountHolder, amount);
    }

    @Override
    public EconomyResponse deposit(OfflinePlayer accountHolder, double amount) {
        return deposit(accountHolder, amount);
    }

    @Override
    public EconomyResponse transfer(UUID sender, UUID receiver, double amount) {
        return transfer(sender, receiver, amount);
    }

    @Override
    public boolean hasAccount(String accountHolder) {
        return hasAccount(accountHolder);
    }

    @Override
    public boolean hasAccount(UUID accountHolder) {
        return hasAccount(accountHolder);
    }

    @Override
    public boolean hasAccount(OfflinePlayer accountHolder) {
        return hasAccount(accountHolder);
    }

//    @Override
//    public Account getAccount(String accountHolder) {
//        return getAccount(accountHolder);
//    }
//
//    @Override
//    public Account getAccount(UUID accountHolder) {
//        return getAccount(accountHolder);
//    }
//
//    @Override
//    public Account getAccount(OfflinePlayer accountHolder) {
//        return getAccount(accountHolder);
//    }

    @Override
    public boolean createAccount(String accountHolder) {
        return createAccount(accountHolder);
    }

    @Override
    public boolean createAccount(UUID accountHolder) {
        return createAccount(accountHolder);
    }

    @Override
    public boolean createAccount(UUID accountHolderId, String accountHolder) {
        return createAccount(accountHolderId, accountHolder);
    }

    @Override
    public boolean createAccount(OfflinePlayer accountHolder) {
        return createAccount(accountHolder);
    }

    @Override
    public boolean deleteAccount(String accountHolder) {
        return deleteAccount(accountHolder);
    }

    @Override
    public boolean deleteAccount(UUID accountHolder) {
        return deleteAccount(accountHolder);
    }

    @Override
    public boolean deleteAccount(OfflinePlayer accountHolder) {
        return deleteAccount(accountHolder);
    }
}