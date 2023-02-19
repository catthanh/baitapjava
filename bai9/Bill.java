public class Bill {
    Customer customer;
    double previousNumber;
    double currentNumber;

    public Bill(Customer customer, double previousNumber, double currentNumber) {
        this.customer = customer;
        this.previousNumber = previousNumber;
        this.currentNumber = currentNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPreviousNumber() {
        return previousNumber;
    }

    public void setPreviousNumber(double previousNumber) {
        this.previousNumber = previousNumber;
    }

    public double getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(double currentNumber) {
        this.currentNumber = currentNumber;
    }

    double getTotal() {
        return (currentNumber-previousNumber)*5;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer +
                ", previousNumber=" + previousNumber +
                ", currentNumber=" + currentNumber +
                '}';
    }
}
