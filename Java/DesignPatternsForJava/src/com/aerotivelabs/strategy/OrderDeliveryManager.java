package com.aerotivelabs.strategy;

public class OrderDeliveryManager {
    public void ScanOrder(IOrder order){
        switch(order.getShippingCountry())
        {
            case "Internal":
                order.setCargo(new InternalStrategy());
                break;
            case "External":
                switch (order.getShippingMethod()){
                    case "Parcel":
                        order.setCargo(new ParcelExternalStrategy());
                        break;
                    case "Ship":
                        order.setCargo(new ShipExternalStrategy());
                        break;
                }
                break;
        }
    }

}
