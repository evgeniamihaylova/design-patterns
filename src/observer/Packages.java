package observer;


import java.util.ArrayList;
import java.util.List;

public class Packages implements StatusOfShipment{

	private List<Package> thePackagesAreSend = new ArrayList<Package>();
	private List<Package> thePackagesAreRecieved = new ArrayList<Package>();
	private String name;

	public void setName(String name) {
		this.name = name;
		this.notifyObservers();
	}

	@Override
	public void receiving(Package pack) {
		this.thePackagesAreRecieved.remove(pack);
	}

	@Override
	public void sending(Package pack) {
		this.thePackagesAreSend.add(pack);
		pack.setStatus(this);
	}

	@Override
	public String getUpdate() {
		return this.name;
	}

	@Override
	public void notifyObservers() {
		for(Package pack: this.thePackagesAreRecieved) {
			pack.update();
		}
	}



}
