package pl.monikagapinska.firstprogramme.classandobject;

public class Client {
    public final static String COMPANY_NAME = "XEROX";
    private String firstName;
    private String lastName;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void introduceYourself() {
        System.out.printf("Hello, I am %s %s%n", firstName, lastName);
    }
}