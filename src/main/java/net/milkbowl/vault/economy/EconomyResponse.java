package net.milkbowl.vault.economy;

public class EconomyResponse {

    private final double amount;
    private final double balance;
    private final ResponseType type;
    private final String errorMessage;

    public EconomyResponse(final double amount, final double balance, final ResponseType type, final String errorMessage) {
        this.amount = amount;
        this.balance = balance;
        this.type = type;
        this.errorMessage = errorMessage;
    }

    public boolean transactionSuccess() {
        return type == ResponseType.SUCCESS;
    }

    public enum ResponseType {
        SUCCESS(1),
        FAILURE(2),
        NOT_IMPLEMENTED(3);

        private final int id;

        ResponseType(final int id) {
            this.id = id;
        }

        int getId() {
            return this.id;
        }
    }
}