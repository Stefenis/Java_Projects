public class lab3 {

    public static void main(String[] args) {

        Television tv = new Television();
        tv.setProductDetails("Television-001", "LG 65 4K UHD TV", 359999, "LG", "LED");
        tv.printProductDetails();

        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setProductDetails("MobilePhone-001", "Huawei P40 Pro", 259900, 12, "Android 10", 256);
        mobilePhone.printProductDetails();

    }
}
//This is Abstraction
abstract class Products {
    protected String pID;
    protected String name;
    protected double price;

    public void setProductDetails(String pID, String name, double price) {
        this.pID = pID;
        this.name = name;
        this.price = price;
    }

    public void printProductDetails() {
        System.out.println("Product Details");
        System.out.println("---------------");
        System.out.println("pID = " + pID);
        System.out.println("name = " + name);
        System.out.println("price = " + price + "LKR");
        System.out.println("\n");

    }
}

class MobilePhone extends Products {
    private int ram;
    private String os;
    private int sdCard;

    public void setProductDetails(String pID, String name, double price, int ram, String os, int sdCard) {
        this.pID = pID;
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.os = os;
        this.sdCard = sdCard;
    }

    @Override
    public void printProductDetails() {
        System.out.println("Mobile Phone Details");
        System.out.println("--------------------");
        System.out.println("Product ID = " + pID);
        System.out.println("Product Name = " + name);
        System.out.println("Price = " + price + " LKR");
        System.out.println("RAM = " + ram + "GB");
        System.out.println("OS = " + os);
        System.out.println("SdCard = " + sdCard + " GB");
        System.out.println("\n");

    }

}

class Television extends Products {
    private String brand;
    private String technology;

    public void setProductDetails(String pID, String name, double price, String brand, String technology) {
        this.pID = pID;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.technology = technology;
    }

    @Override
    public void printProductDetails() {
        System.out.println("Television Details");
        System.out.println("------------------");
        System.out.println("Product ID = " + pID);
        System.out.println("Product Name = " + name);
        System.out.println("Price = " + price);
        System.out.println("Brand = " + brand);
        System.out.println("Technology = " + technology);
        System.out.println("\n");
    }
}