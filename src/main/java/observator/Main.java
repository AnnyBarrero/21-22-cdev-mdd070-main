package observator;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        MailSubscriber mailSubscriber = new MailSubscriber("alexandre@ipi.com");
        document.subscribe(mailSubscriber);

        MailSubscriber mailSubscriber2 = new MailSubscriber("paul@ipi.com");
        document.subscribe(mailSubscriber2);

        SmsSubscriber smsSubscriber = new SmsSubscriber("06839394034");
        document.subscribe(smsSubscriber);


        document.sauvegarder();
    }
}
