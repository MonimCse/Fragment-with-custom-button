package org.login.com.factorydesignpattern.factory.address_factory;

import android.location.Address;
import android.widget.Switch;

public class AddressFactory {

    public String getAddress(String addressType) {
        IAddress address;
        switch (addressType) {
            case "Home":
                 address = new HomeAddress();
                return address.getAddress();

            case "Office":
                address = new OfficeAddress();
                return address.getAddress();

            case "Others":
                address = new OthersAddress();
                return address.getAddress();
            default:
                return null;
        }
    }

}
