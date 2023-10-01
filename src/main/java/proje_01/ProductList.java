package proje_01;

public class ProductList {

    // POJO CLASS
    private String productName; //Ürün Adı
    private String brand; //Marka
    private int stockAmount; //Stok Tutarı
    private String unit; //Birim
    private String shelf; //Raf
    // sack, can, box, bottle etc


    public ProductList(String productName, String brand, int stockAmount, String unit, String shelf) {
        this.productName = productName;
        this.brand = brand;
        this.stockAmount = stockAmount;
        this.unit = unit;
        this.shelf = shelf;

    }


    public ProductList() {
    }


    public String getProductName() {
        return productName.toLowerCase();
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand.toLowerCase();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getUnit() {
        return unit.toLowerCase();
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", stockAmount=" + stockAmount +
                ", unit='" + unit + '\'' +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}