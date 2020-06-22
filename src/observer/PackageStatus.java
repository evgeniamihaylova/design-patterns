package observer;

public class PackageStatus implements Package{

	private String name;
	private StatusOfShipment packageStatus;
	
	public PackageStatus(String name) {
		this.setName(name);
	}
	@Override
	public void update() {
		if(packageStatus == null) {
			System.out.println("There are no packages");
			return;
		}
		
		String packStatus = packageStatus.getUpdate();
		System.out.println(this.getName() + " updated: " + "The status is: " + packStatus);
	}
	@Override
	public void setStatus(StatusOfShipment status) {
		// TODO Auto-generated method stub
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
