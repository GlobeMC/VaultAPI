package net.milkbowl.vault.economy;

import org.bukkit.OfflinePlayer;

import java.util.UUID;

public interface Economy {

    boolean isEnabled();

    String getName();

    double getBalance(final String p0);

    double getBalance(final UUID p0);

    double getBalance(final OfflinePlayer p0);

    boolean has(final String p0, final double p1);

    boolean has(final UUID p0, final double p1);

    boolean has(final OfflinePlayer p0, final double p1);

    EconomyResponse withdraw(final String p0, final double p1);

    EconomyResponse withdraw(final UUID p0, final double p1);

    EconomyResponse withdraw(final OfflinePlayer p0, final double p1);

    EconomyResponse deposit(final String p0, final double p1);

    EconomyResponse deposit(final UUID p0, final double p1);

    EconomyResponse deposit(final OfflinePlayer p0, final double p1);

    EconomyResponse transfer(final UUID sender, final UUID receiver, final double amount);

    boolean hasAccount(final String p0);

    boolean hasAccount(final OfflinePlayer p0);

    boolean hasAccount(final UUID p0);

//    Account getAccount(final String p0);
//
//    Account getAccount(final OfflinePlayer p0);
//
//    Account getAccount(final UUID p0);

    boolean createAccount(final String p0);

    boolean createAccount(final UUID p0);

    boolean createAccount(final UUID po, String p1);

    boolean createAccount(final OfflinePlayer p0);

    boolean deleteAccount(final String p0);

    boolean deleteAccount(final UUID p0);

    boolean deleteAccount(final OfflinePlayer p0);

    int fractionalDigits();

    String currencyNamePlural();

    String currencyNameSingular();

    String format(final double p0);
}