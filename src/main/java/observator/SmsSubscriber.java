package observator;

public class SmsSubscriber implements DocumentSubscriber {
    private String telephone;

    public SmsSubscriber(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public void onSave() {
        // envoyerSMS(telephone);
    }
}
