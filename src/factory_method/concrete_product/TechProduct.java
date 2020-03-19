package factory_method.concrete_product;

import factory_method.product_interface.IProduct;

public class TechProduct implements IProduct {
    private int ID;
    private String name;
    private int barCode;
    private String details;

    public TechProduct(int id, String name, int barCode) {
        ID = id;
        this.name = name;
        this.barCode = barCode;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "TechProduct{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }
}
