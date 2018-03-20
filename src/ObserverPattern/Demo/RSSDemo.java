package ObserverPattern.Demo;

public class RSSDemo {

	public static void main(String[] args) {
		
		RSS techGossip = new RSS();
		RSSReader john = new RSSReader("John Doe", techGossip);
		RSSReader alice = new RSSReader("Alice P. Hacker", techGossip);
		
		techGossip.addHeader("Microsoft to release source code for Windows 9");
		techGossip.addHeader("NoMagic, makers of MagicDraw, goes bankruptcy");
		
		RSSReader bob = new RSSReader("Uncle Bob", techGossip);
		techGossip.unregister(john);
		
		techGossip.addHeader("OMG to drop UML");
		techGossip.addHeader("Google to hire Steve Ballmer");
		
		techGossip.unregister(alice);
		techGossip.unregister(bob);
		techGossip.addHeader("techGossip sued for publishing crappy stuff");
		
	}

}
