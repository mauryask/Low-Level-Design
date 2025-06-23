package PaymentSystemExample;

public class DebitCard extends Card{
    public DebitCard(String cardName, String cardNo) {
        super(cardName, cardNo);
    }

    @Override
    public void pay(){
        System.out.println("Making payment via debit card: "+ getCardName());
    }
}
