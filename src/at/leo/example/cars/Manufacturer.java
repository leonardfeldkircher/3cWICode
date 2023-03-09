package at.leo.example.cars;

public class Manufacturer {
    public String Name;
    public String Country;
    public double Sale;


    public Manufacturer(String name, String country, double sale) {
        Name = name;
        Country = country;
        Sale = sale;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public double getSale() {
        return Sale;
    }

    public void setSale(double sale) {
        Sale = sale;
    }


}
