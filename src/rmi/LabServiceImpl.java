package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LabServiceImpl extends UnicastRemoteObject implements LabService {
	private static final long serialVersionUID = 2674880711467464646L;

	protected LabServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public String getInforamtion() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Invocation de la methode getInformation()");
		return "bonjour";
	}

}
