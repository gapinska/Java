package pl.monikagapinska.firstprogramme.constructors;

public class Product {
    private String name;
    private int price;

    public Product() {
        this.name = "no-name";
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
