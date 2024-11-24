package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LabService extends Remote {

	public String getInforamtion() throws RemoteException;

}
