package rmi;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class StartServeur {

	public static void main(String[] args) {

		try {

			LocateRegistry.createRegistry(1099);
			if (System.getSecurityManager() == null) {
	            System.out.println("Setting up Security Manager");
	            System.setSecurityManager(new RMISecurityManager());
	        }
			System.out.println("Mise en plmace de security manager");
			
			 
			LabServiceImpl informatioImpl = new LabServiceImpl();
			String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/RMI";
			System.out.println("enregsistrement de l'objet avec url :" + url);
			Naming.rebind(url, informatioImpl);
			System.out.println("serveur lance");

		} catch (RemoteException e) {
			e.printStackTrace();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
