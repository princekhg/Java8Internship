package BusinessModelCapgemini;

public class Customer{
    long customerId;
    long customerName;
    String password;
    Address address;
    String email;


    public Customer(long customerId, long customerName, String password, Address address, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.address = address;
        this.email = email;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getCustomerName() {
        return customerName;
    }

    public void setCustomerName(long customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer - " +
                "customerId=" + customerId +
                ", customerName=" + customerName +
                ", password='" + password + ' ' +
                ", address=" + address +
                ", email='" + email + ' ';
    }
}
