package observator;

public interface Publisher {

    void subscribe(DocumentSubscriber documentSubscriber);

    void unsubscribe(DocumentSubscriber documentSubscriber);
}
