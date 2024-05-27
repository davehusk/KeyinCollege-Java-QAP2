// Money.java
// This class models a monetary value.

public class Money {
    private double amount;  // The amount of money.

    // Constructor to initialize the amount.
    public Money(double amount) {
        this.amount = amount;
    }

    // Copy constructor to create a new Money object with the same amount.
    public Money(Money other) {
        this.amount = other.amount;
    }

    // Getter for the amount.
    public double getAmount() {
        return amount;
    }

    // Setter for the amount.
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Checks if two Money objects are equal.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return Double.compare(money.amount, amount) == 0;
    }

    // Returns a string representation of the amount.
    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }

    // Compares two Money objects.
    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }
}
