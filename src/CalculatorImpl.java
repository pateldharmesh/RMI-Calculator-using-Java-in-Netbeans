import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class CalculatorImpl extends UnicastRemoteObject implements Calculator
{
    protected CalculatorImpl() throws RemoteException
{
}
public long add(long a, long b) throws RemoteException
{
return a+b;
}
}