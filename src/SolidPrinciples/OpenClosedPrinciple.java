package SolidPrinciples;

// not open closed , need to change the funcationality

import org.w3c.dom.Node;

class Invoide{
    public String user;

    Invoide(String user){
        this.user = user;
    }

    public int getDiscount(String user){
        if(this.user.equals("NORMAL")){
            return 5;
        }
        if(this.user.equals("VIP")){
            return 10;
        }
        else{
            return 0;
        }
    }
}

// in above code we need to make changes for all changes
// we can fix this

interface Discount{
    int getDiscount();
}
class NormalUser implements  Discount{
    public int getDiscount(){
        return 5;
    }
}
class VipUser implements  Discount{
    public int getDiscount(){
        return 10;
    }
}

class Invoice{
    Discount discount ;
    Invoice(Discount discount){
        this.discount = discount;
    }
    int getDiscount(){
        return discount.getDiscount();
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        // it means open for extension closed for modification
        // already written code / functionality should be extended not modified

        NormalUser user = new NormalUser();
        VipUser vipuser = new VipUser();
        Invoice invoice  = new Invoice(user);
        Invoice vipInvoice = new Invoice(vipuser);
        System.out.println(invoice.getDiscount());
        System.out.println(vipInvoice.getDiscount());

    }
}
