package pl.monikagapinska.firstprogramme.constructors;

public class Main {
    public static void main(String[]arguments){
        Product product = new Product("milk", 14);
        System.out.println("Name: "+ product.getName());
        System.out.println("Price: "+ product.getPrice());
    }
}
