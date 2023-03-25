package Lab1.Ex6;

public class Order {
    private int orderID;
    private String orderStatus;
    private Product productObj;

    public Order(int orderID, String orderStatus, Product product) {
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.productObj = product;

    }

    public int getOrderID() {
        return orderID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }


    public Product getProductObj(){
    return productObj;
    }

    
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setProductObj(Product productObj) {
        this.productObj = productObj;
    }
}

