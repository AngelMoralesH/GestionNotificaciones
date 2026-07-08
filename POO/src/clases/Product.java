package clases;

public class Product {
    //metodos de instancia
    //metodos estaticos
    //palabra static
    String code;
    String name;
    double price;

    public Product() {
        this("N/A","Generric Product",0.0);
    }

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    void applyDiscount(double percentage){
        price -= price* percentage / 100;
    }
    void showInformation(){
        System.out.println("code: %s \t Name %s\tPrice $%.2f".formatted(code,name,price));
    }
    static Product createDemoProduct(){
        return new Product("P001","Scccer Ball", 600.3654);
    }
}
