package com.aerotivelabs.pattern.strategy;

public class OrderDeliveryManager {
    public void ScanOrder(IOrder order) {
        order.setCargo(IdentifyDeliveryStrategy(order));
    }

    private IStrategy IdentifyDeliveryStrategy(IOrder order) {
        String temp = order.getShippingCountry();
        if (temp.equals("Internal")) {
            return new InternalStrategy();
        } else if (temp.equals("External")) {
            temp = order.getShippingMethod();
            if (temp.equals("Parcel")) {
                return new ParcelExternalStrategy();
            }
            else if(temp.equals("Ship")){
                    return new ShipExternalStrategy();

            }
        }
        return null;
    }

}
