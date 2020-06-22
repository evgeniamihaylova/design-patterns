package observer;

public class Main {
	public static void main(String[] args) {


		Packages pack = new Packages();
		Package obs1 = new PackageStatus("package 1");
		Package obs2 = new PackageStatus("package 2");
		Package obs3 = new PackageStatus("package 3");
		
		pack.receiving(obs1);
		pack.sending(obs2);
		pack.receiving(obs3);
	
	}
}
