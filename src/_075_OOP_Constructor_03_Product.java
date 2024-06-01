class productConstructor{
    private String itemNo;
    private String productName;
    private double price;
    private short qty;

    public String getItemNo(){return  itemNo;}
    public String getProductName(){return productName;}
    public double getPrice(){return price;}
    public short getQty(){return qty;}

    public double setPrice(double p){ return p;}
    public void setQty(short qty) { this.qty=qty;}

    public productConstructor(String itemNo){
        itemNo=itemNo;
    }
    public productConstructor(String itemNo,String productName,double price,short qty)
    {
        itemNo=itemNo;
        this.productName=productName;
        setPrice(price);
        setQty(qty);
    }
}
public class _075_OOP_Constructor_03_Product {
    public static void main(String[] args) {
        productConstructor p1 = new productConstructor("A123");
        productConstructor p2= new productConstructor("A123","Pepsi Can", 2.5, (short) 1);
    }
}
