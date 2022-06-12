package observator;

import java.util.ArrayList;
import java.util.List;

public class Document implements Publisher {

    private List<DocumentSubscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(DocumentSubscriber documentSubscriber) {
        subscribers.add(documentSubscriber);
    }

    @Override
    public void unsubscribe(DocumentSubscriber documentSubscriber) {
        subscribers.remove(documentSubscriber);
    }

    public void sauvegarder() {
        //...
        for (DocumentSubscriber subscriber : subscribers) {
            subscriber.onSave();
        }

    }

}
