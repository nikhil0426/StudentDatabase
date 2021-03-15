import java.util.Scanner;

public class Address {

    private int number = -1;
    private String street = "";
    private String city = "";
    private String state = "";
    private String zipCode = "";
    private String country = "";

    public Address() {

    }

    public Address(int number, String street, String city, String state, String zipCode, String country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public void requestAddress() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter Country: ");
                setCountry(scan.nextLine().trim());
                System.out.print("Enter Zip Code: ");
                setZipCode(scan.nextLine().trim());
                System.out.print("Enter State/Province: ");
                setState(scan.nextLine().trim());
                System.out.print("Enter City/Town/Locality: ");
                setCity(scan.nextLine().trim());
                System.out.print("Enter Street: ");
                setStreet(scan.nextLine().trim());
                System.out.print("Enter House/Building Number: ");
                setNumber(scan.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Error, not a valid input. Please try again!");
            }
        }
        scan.close();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return getNumber() + " " + getStreet() + "\n" + getCity() + ", "
                + getState() + " " + getZipCode() + "\n" + getCountry();
    }
}
