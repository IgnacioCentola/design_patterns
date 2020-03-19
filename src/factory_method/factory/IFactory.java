package factory_method.factory;

import factory_method.product_interface.IProduct;

public interface IFactory {
    IProduct getProduct(int id, String name, int barCode);
}
