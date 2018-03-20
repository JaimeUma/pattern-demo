package ObserverPattern.Demo;

import ObserverPattern.IObserver;

public class RSSReader implements IObserver {

    String readerId;
    RSS feed;

    public RSSReader(String readerId, RSS feed) {
        this.readerId = readerId;
        this.feed = feed;
        feed.register(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s receives news: %s", readerId,
                feed.getHeader()));
    }
}
