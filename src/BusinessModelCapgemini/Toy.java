package BusinessModelCapgemini;

public class Toy{
    long toyId;
    String toyName;
    String toyType;
    long minAge;
    long maxAge;
    double price;
    long quantity;
    double rentalAmount;
    double refundableDeposit;

    public long getToyId() {
        return toyId;
    }

    public void setToyId(long toyId) {
        this.toyId = toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getToyType() {
        return toyType;
    }

    public void setToyType(String toyType) {
        this.toyType = toyType;
    }

    public long getMinAge() {
        return minAge;
    }

    public void setMinAge(long minAge) {
        this.minAge = minAge;
    }

    public long getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(long maxAge) {
        this.maxAge = maxAge;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getRentalAmount() {
        return rentalAmount;
    }

    public void setRentalAmount(double rentalAmount) {
        this.rentalAmount = rentalAmount;
    }

    public double getRefundableDeposit() {
        return refundableDeposit;
    }

    public void setRefundableDeposit(double refundableDeposit) {
        this.refundableDeposit = refundableDeposit;
    }

    @Override
    public String toString() {
        return "Toy - " +
                "toyId=" + toyId +
                ", toyName='" + toyName + ' ' +
                ", toyType='" + toyType + ' ' +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", price=" + price +
                ", quantity=" + quantity +
                ", rentalAmount=" + rentalAmount +
                ", refundableDeposit=" + refundableDeposit;
    }
}
