package factory_method.concrete_factory;

import factory_method.concrete_product.TechProduct;
import factory_method.factory.IFactory;
import factory_method.product_interface.IProduct;

public class TechProductFactory implements IFactory {
    @Override
    public IProduct getProduct(int id, String name, int barCode) {
        return new TechProduct(id, name, barCode);
    }
}
