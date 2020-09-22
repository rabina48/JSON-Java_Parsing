package practice.json;

public class Properties {
    public BillingAddress billing_address;
    public ShippingAddress shipping_address;

    Properties(){

    }

    public Properties(BillingAddress billing_address, ShippingAddress shipping_address) {
        this.billing_address = billing_address;
        this.shipping_address = shipping_address;
    }
}
