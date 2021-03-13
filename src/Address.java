public class Address {

    public int number = -1;
    public String street = "";
    public String city = "";
    public String state = "";
    public String zipCode = "";
    public String country = "";

    public void requestAddress() {

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
