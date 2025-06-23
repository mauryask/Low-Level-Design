package paymentsystem;

public abstract class Card implements PaymentMethod {

    private String cardName;
    private String cardNo;

    public Card(String cardName, String cardNo) {
        this.cardName = cardName;
        this.cardNo = cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardNo() {
        return cardNo;
    }

    @Override
    public void pay() {

    }
}
