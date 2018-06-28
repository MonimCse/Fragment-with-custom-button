package org.login.com.factorydesignpattern.factory.address_factory;

import android.location.Address;

public class HomeAddress implements IAddress {
    @Override
    public String getAddress() {
        return "Home Address";
    }
}
