package observator;

public class MailSubscriber implements DocumentSubscriber {
    private String mail;

    public MailSubscriber(String mail) {
        this.mail = mail;
    }

    @Override
    public void onSave() {
        // envoyerMail(mail);
    }
}
