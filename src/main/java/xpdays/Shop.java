package xpdays;

public class Shop {

    private float sum=0;

    public void addItemToCart(String item, float price) {
        sum += price;
    }

    public float getSum() {
        return sum;
    }

}
