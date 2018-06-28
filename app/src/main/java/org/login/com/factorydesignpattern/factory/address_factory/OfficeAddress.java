package org.login.com.factorydesignpattern.factory.address_factory;

public class OfficeAddress implements IAddress {
    @Override
    public String getAddress() {
        return "Office Address";
    }
}
