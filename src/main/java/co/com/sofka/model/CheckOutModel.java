package co.com.sofka.model;

public class CheckOutModel {
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zipCode;
    private String phoneNumber;

    public static CheckOutModel shippingInfo(){
        return new CheckOutModel();
    }

    public CheckOutModel createShippingInfo(){
        this.email = "example@gmail.com.co";
        this.firstName = "Primer Nombre";
        this.lastName = "Apellido";
        this.address = "Direccion";
        this.city = "Ciudad";
        this.zipCode = "12345";
        this.phoneNumber = "0001234567";
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
