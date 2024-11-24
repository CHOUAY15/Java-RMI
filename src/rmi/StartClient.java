package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class StartClient {

	public static void main(String[] args) {

		try {
			Remote r = Naming.lookup("rmi://127.0.0.1/RMI");
			System.out.println(r);
			String s = ((LabService) r).getInforamtion();
			System.out.println("chaine renvoyee = :" + s);
		} catch (MalformedURLException e) {
			e.printStackTrace();

		}
		// TODO Auto-generated method stub
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
