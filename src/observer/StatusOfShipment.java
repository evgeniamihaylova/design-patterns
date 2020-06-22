package observer;

public interface StatusOfShipment {
	
	public void receiving(Package pack);
	public void sending(Package pack);
	public String getUpdate();
	public void notifyObservers();
}
