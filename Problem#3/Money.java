public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        long totalCents = Math.round(amount * 100); // Round to the nearest cent
        this.dollars = totalCents / 100; // Get dollars
        this.cents = totalCents % 100; // Get cents
    }
    
    //Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Add method
    public Money add(Money otherAmount) {
        long totalCents = this.cents + otherAmount.cents;
        long totalDollars = this.dollars + otherAmount.dollars + totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalDollars + totalCents / 100.0);
    }

    // Subtratc method
    public Money subtract(Money otherAmount) {
        long totalCents = this.cents - otherAmount.cents;
        long totalDollars = this.dollars - otherAmount.dollars + totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalDollars + totalCents / 100.0);
    }

    // Compare method
    public int compareTo(Money other) {
        if (this.dollars > other.dollars) {
            return 1; // Current object's dollars is greater than the other object's dollars
        } else if (this.dollars < other.dollars) {
            return -1; // Current object's dollars is less than the other object's dollars
        } else {
            // If dollars are equal, compare the cents
            return Long.compare(this.cents, other.cents); // Returns 1, 0, or -1 based on cent comparison
        }
    }

    // Equals method
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same object reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Null or different class
        }
        Money other = (Money) obj; // Typecast obj to Money
        return this.dollars == other.dollars && this.cents == other.cents; // Compare fields
    }

    // toString method for easy representation
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents); // Format as currency
    }
}