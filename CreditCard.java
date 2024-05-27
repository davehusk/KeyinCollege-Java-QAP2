// CreditCard.java
// This class models a credit card with an owner, balance, and credit limit.

public class CreditCard {
    private Person owner;      // The owner of the credit card.
    private Money balance;     // The balance on the credit card.
    private Money creditLimit; // The credit limit of the credit card.

    // Constructor to initialize the credit card with an owner and credit limit.
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }

    // Getter for the balance.
    public Money getBalance() {
        return new Money(balance);
    }

    // Getter for the credit limit.
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Returns the owner's information as a string.
    public String getPersonals() {
        return owner.toString();
    }

    // Charges an amount to the credit card if it does not exceed the credit limit.
    public void charge(Money amount) {
        if (balance.getAmount() + amount.getAmount() <= creditLimit.getAmount()) {
            balance.setAmount(balance.getAmount() + amount.getAmount());
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Makes a payment on the credit card by subtracting the amount from the balance.
    public void payment(Money amount) {
        balance.setAmount(balance.getAmount() - amount.getAmount());
        System.out.println("Payment: " + amount);
    }
}
