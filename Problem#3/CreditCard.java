public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);  // Using the copy constructor
        this.balance = new Money(0);  // Start with a balance of 0
    }

    // Accessor for balance
    public Money getBalance() {
        return new Money(balance);  // Return a new copy of the balance
    }

    // Accessor for credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit);  // Return a new copy of the credit limit
    }

    // Accessor for personal information (calls toString on owner)
    public String getPersonals() {
        return owner.toString();
    }

    // Charge method
    public void charge(Money amount) {
        Money newBalance = this.balance.add(amount); // Update newBalance properly
        if (newBalance.compareTo(creditLimit) <= 0) {
            this.balance = newBalance; // Assign the updated balance to the instance variable
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Payment method
    public void payment(Money amount) {
        this.balance = this.balance.subtract(amount); // Update balance after payment
        System.out.println("Payment: " + amount);
    }
}
