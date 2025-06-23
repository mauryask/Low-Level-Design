package paymentsystem;

public class CreditCard extends Card{
    public CreditCard(String cardName, String cardNo) {
        super(cardName, cardNo);
    }
    @Override
    public void pay(){
        System.out.println("Making payment via credit card: "+ getCardName());
    }

}
